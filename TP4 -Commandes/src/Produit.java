public class Produit {

    private String libelle;
    private String description;

    public Produit(String libelle, String description) {
        this.libelle = libelle;
        this.description = description;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public String getDescription() {
        return this.description;
    }
}
