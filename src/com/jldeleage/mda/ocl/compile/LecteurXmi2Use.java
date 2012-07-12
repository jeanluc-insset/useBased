package com.jldeleage.mda.ocl.compile;




import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.tzi.use.parser.use.USECompiler;
import org.tzi.use.uml.mm.MModel;
import org.tzi.use.uml.mm.ModelFactory;
import org.w3c.dom.Document;



/**
 * "Enrobe" le compilateur USE pour lui faire lire un document XMI de
 * MagicDraw.<br/>
 * En fait, le mod&egrave;le XMI est transform&eacute; en mod&egrave;le
 * XML de USE.<br/>
 * Ensuite, cet XML est lu par le compilateur USE et on obtient une
 * instance de MModel.<br/>
 * TODO: on pourrait ajouter au mod&egrave;le USE les r&eacute;f&eacute;rences
 * du mod&egrave;le initial. Autre possibilit&eacute;&#160;: on enrichit le
 * mod&egrave;le initial avec les informations de mood&egrave;le USE en se
 * basant sur les identifiants.
 *
 * @author jldeleage
 */
public class LecteurXmi2Use {

    final static String
            PROP="javax.xml.transform.TransformerFactory";
    final static String
            SAXON="net.sf.saxon.TransformerFactoryImpl";


    public MModel lisXmi(String inNomFichier) throws FileNotFoundException,
            TransformerConfigurationException, TransformerException, UnsupportedEncodingException {
        return lisXmi(new File(inNomFichier));
    }


    public MModel lisXmi(File inFichier) throws FileNotFoundException,
            TransformerConfigurationException, TransformerException, UnsupportedEncodingException {
        return lisXmi(new FileInputStream(inFichier));
    }


    public MModel lisXmi(Document doc) throws TransformerConfigurationException, TransformerException, UnsupportedEncodingException {
        Source source = new DOMSource(doc);
        return lisXmi(source);
    }

    /**
     * 
     * @param inStream : mo&egrave;le XMI 2.0
     * @return : mod&egrave;le USE.
     * @throws TransformerConfigurationException
     * @throws TransformerException
     * @throws UnsupportedEncodingException 
     */
    public MModel lisXmi(InputStream inStream)
            throws TransformerConfigurationException, TransformerException, UnsupportedEncodingException {
        Source source = new StreamSource(inStream);
        return lisXmi(source);
    }

    public MModel lisXmi(Source source) throws TransformerConfigurationException, TransformerException, UnsupportedEncodingException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(409600);
        Result specUseAsResult = new StreamResult(baos);
//        Source sourceLecteur = new StreamSource(getClass().getResourceAsStream("/rsrc/lectureMD2use.xsl"));
        Source sourceLecteur = new StreamSource(getClass().getResourceAsStream("/rsrc/lectureVP2use.xsl"));
        System.setProperty(PROP, SAXON);
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer(sourceLecteur);

        transformer.transform(source, specUseAsResult);

        String specUseAsString = baos.toString("UTF-8");
        String nomFichierTemporaire = null;
        try {
            String nomDossierTemporaire = System.getProperty("java.io.tmpdir");
            File fichierIntermediaire = new File(nomDossierTemporaire, "ete/use/");
            fichierIntermediaire.mkdirs();
            fichierIntermediaire = new File(fichierIntermediaire, "intermediaire.use");
            nomFichierTemporaire = fichierIntermediaire.getAbsolutePath();
            PrintWriter out = new PrintWriter(new FileWriter(fichierIntermediaire));
            out.print(specUseAsString);
            out.flush();
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(LecteurXmi2Use.class.getName()).log(Level.SEVERE, null, ex);
        }

        ModelFactory mf = new ModelFactory();
        MModel resultat = USECompiler.compileSpecification(specUseAsString, nomFichierTemporaire, new PrintWriter(System.err), mf);
        return resultat;
    }       // lisXmi(InputStream)


}

