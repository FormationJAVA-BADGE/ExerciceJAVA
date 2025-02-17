public class Membre extends Utilisateur{

    public Membre(String prenom, String email) {
        super(prenom, email);
    }

    @Override
    public void login() {
        System.out.println("login user/password");
    }
}
