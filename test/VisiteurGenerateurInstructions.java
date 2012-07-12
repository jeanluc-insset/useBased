

import com.jldeleage.mda.ocl.modele.Predicat;
import com.jldeleage.mda.ocl.modele.predicat.*;
import org.tzi.use.uml.ocl.type.CollectionType;
import org.tzi.use.uml.ocl.type.Type;



/**
 *
 * @author jldeleage
 */
public class VisiteurGenerateurInstructions extends VisiteurInstructionParDefaut implements VisiteurInstruction {

    protected String getTypeAsJavaString(Type t) {
        if (t.isCollection(true)) {
            StringBuilder buffer = new StringBuilder("List<");
            CollectionType ct = (CollectionType) t;
            Type elemType = ct.elemType();
            buffer.append(getTypeAsJavaString(elemType));
            buffer.append(">");
            return buffer.toString();
        }
        return t.toString();
    }

    @Override
    public void visiteNavigationDansCode(NavigationDansCode aThis) {
        Type typeVariable = aThis.getTypeVariable();
        String typeVariableAsString = getTypeAsJavaString(typeVariable);
        System.out.print(getTypeAsJavaString(typeVariable));
        System.out.print(' ');
        System.out.print(aThis.getNomVariable());
        System.out.print(" = ");
        Type typeDepart = aThis.getTypeVariableDepart();
        if (typeDepart != null && typeDepart.isCollection(true)) {
            // Il faut générer le parcours de la collection de départ
            // pour construire la collection d'arrivée
            CollectionType ct = (CollectionType) aThis.getTypeVariableDepart();
            Type typeElemDepart = ct.elemType();
            String typeElemDepartAsString = getTypeAsJavaString(typeElemDepart);
            System.out.print(" new LinkedList<");
            CollectionType cta = (CollectionType) typeVariable;
            System.out.print(getTypeAsJavaString(cta.elemType()));
            System.out.println(">();");
            System.out.print("for (");
            System.out.print(typeElemDepartAsString);
            System.out.print(" un");
            System.out.print(aThis.getNomVariableDepart());
            System.out.print(" : ");
            System.out.print(aThis.getNomVariableDepart());
            System.out.println(") {");
            System.out.print(aThis.getNomVariable());
            System.out.print(".add(un");
            System.out.print(aThis.getNomVariableDepart());
            System.out.println(");");
            System.out.println("}");
        }
        else {            
            System.out.println(
                aThis.getNomVariableDepart() + ".get"
                + initMaj(aThis.getNomRole()) + "()");
        }
    }


    @Override
    public void visiteJointure(Jointure aThis) {
        System.out.println("JOINTURE : " + aThis.getTypeVariable() + " " + aThis.getNomVariable()
                + " = " + aThis.getNomVariableDepart() + ".get"
                + initMaj(aThis.getNomRole()) + "()");
    }


    @Override
    public void visiteNavigationDansPredicat(NavigationDansPredicat aThis) {
        System.out.println("SELECT : " + aThis.getTypeVariable()
                + " " + aThis.getNomVariable()
                + " = " + aThis.getNomVariableDepart() + ".get"
                + initMaj(aThis.getNomRole()) + "()");
    }


    @Override
    public void visiteCollectDansCode(CollectDansCode aThis) {
        System.out.print("List<");
        System.out.print(aThis.getTypeVariable());
        System.out.print("> ");
        System.out.print(aThis.getNomVariable());
        System.out.print(" = new LinkedList<");
        System.out.print(aThis.getTypeVariable());
        System.out.println(">();");
        System.out.print("for (");
        System.out.print(aThis.getTypeVariableDepart());
        System.out.print(" var : ");
        System.out.print(aThis.getNomVariableDepart());
        System.out.println(") {");
        System.out.print(aThis.getNomVariable());
        System.out.print(".add(");
        System.out.print(aThis.getNomVariableDepart());
        System.out.print(".get");
        System.out.print(aThis.getNomRole());
        System.out.println("());");
        System.out.println("}");
    }


    @Override
    public void visiteRoot(Root aThis) {
        System.out.println("Root");
    }


    @Override
    public void visiteSelf(Self aThis) {
//        System.out.println("Self");
    }


    @Override
    public void visiteOperation(Operation aThis) {
        System.out.println(aThis.getTypeVariable() + " " + aThis.getNomVariable()
                + " = " + aThis.getNomOperandeGauche()
                + " op " + aThis.getNomOperandeDroit());
    }


    protected String initMaj(String inString) {
        if (inString == null || inString.length() < 2) {
            return inString;
        }
        return inString.substring(0,1).toUpperCase() + inString.substring(1);
    }


}       // VisiteurGenerateurInstructions

