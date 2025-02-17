//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Utilisateur utilisateur=new Membre("jean", "jean@jean.fr");

        utilisateur=new Administrateur("Paul", "paul@paul.fr");

        ControleAccess ca=new ControleAccess();
        ca.check(utilisateur);
    }
}