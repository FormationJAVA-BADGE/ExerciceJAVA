public class Produit {
    private String nom;
    private double prix;
    private String categorie;

    public Produit(String nom, double prix, String categorie) {
        this.nom = nom;
        this.prix = prix;
        this.categorie = categorie;
    }

    // Getters
    public String getNom() { return nom; }
    public double getPrix() { return prix; }
    public String getCategorie() { return categorie; }
}
