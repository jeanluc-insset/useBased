/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jldeleage.mda.ocl.compile.ConstructeurPredicats;
import com.jldeleage.mda.ocl.compile.ConstructeurSupports;
import com.jldeleage.mda.ocl.compile.LecteurXmi2Use;
import com.jldeleage.mda.ocl.modele.*;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.junit.*;
import static org.junit.Assert.*;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.mm.MModel;

/**
 *
 * @author jldeleage
 */
public class TestSupportsEtPredicats {
    
    public TestSupportsEtPredicats() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


     @Test
     public void retesteTout() throws FileNotFoundException, TransformerConfigurationException, TransformerException, UnsupportedEncodingException {
        System.out.println("lisXmi");
        String inNomFichier = "test/rsrc/essai_export_VP_2.uml";
//        String inNomFichier = "test/rsrc/compagnie_aerienne_1_contrainte.xml";
        LecteurXmi2Use instance = new LecteurXmi2Use();
        MModel result = instance.lisXmi(inNomFichier);

        Modele modele = new Modele(result);

        ConstructeurSupports constructeurSupports = new ConstructeurSupports();
        constructeurSupports.construisSupport(modele);
        afficheClasses(modele);

        ConstructeurPredicats constructeurPredicats = new ConstructeurPredicats();
        constructeurPredicats.construisPredicats(modele);
        System.out.println(modele);

        VisiteurGenerateurInstructions verif = new VisiteurGenerateurInstructions();
        for (Classe uneClasse : modele.getClasses()) {
            for (Role unRole : uneClasse.getRolesContraints()) {
                for (Predicat unPredicat : unRole.getPredicats()) {
                    System.out.println("-------------------");
                    System.out.println("    " + unPredicat);
                    unPredicat.accepte(verif);
                }       // boucle sur les prédicats
            }       // boucle sur les rôles
        }       // boucle sur les classes
     }      // test principal


     /**
      * Affiche les classes et leurs invariants.
      * Pour chacun des invariants, indique le nom, son support et son support
      * élargi.
      * 
      * @param inModele 
      */
     protected void afficheClasses(Modele inModele) {
        Collection<Classe> classes = inModele.getClasses();
        for (Classe uneClasse : classes) {
            System.out.println("==========================================");
            System.out.println("CLASSE " + uneClasse.getMClass().name());
            System.out.println("Invariants :");
            for (Invariant unInvariant : uneClasse.getInvariants()) {
                afficheUnInvariant(unInvariant);
            }
        }
     }      //

     protected void afficheUnInvariant(Invariant inInvariant) {
         System.out.println("    " + inInvariant.getNomInvariant());
         System.out.println("    |" + inInvariant.getStringExpression());
         System.out.println("    | support : ");
         System.out.print("    |");
         for (Role unRole : inInvariant.getSupport()) {
             System.out.print(" " + unRole.getNomRole());
             System.out.print("("
                     + unRole.getClasseArrivee().getMClass().name() + ") ");
         }
         System.out.println("");
         System.out.println("    | support élargi : ");
         System.out.print("    |");
         for (Role unRole : inInvariant.getSupportElargi()) {
             System.out.print(" " + unRole.getNomRole());
             System.out.print("("
                     + unRole.getClasseDepart().getMClass().name()
                     + "->"
                     + unRole.getClasseArrivee().getMClass().name() + ") ");
         }
         System.out.println("");
     }


}       // classe de Test
