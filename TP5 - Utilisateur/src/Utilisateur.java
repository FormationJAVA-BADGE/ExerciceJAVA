public abstract class Utilisateur {

    private String email;
    private String prenom;

    public Utilisateur(String prenom, String email) {
        this.prenom = prenom;
        this.email = email;
    }

    public abstract void login();

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
