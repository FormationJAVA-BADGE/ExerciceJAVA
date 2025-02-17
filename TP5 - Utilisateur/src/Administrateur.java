public class Administrateur extends Utilisateur{


    public Administrateur(String prenom, String email) {
        super(prenom, email);
    }

    @Override
    public void login() {
        System.out.println("login biométrie");
    }


}
