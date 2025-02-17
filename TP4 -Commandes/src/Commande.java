import java.util.ArrayList;

public class Commande {

    private Client client;
    private ArrayList<Produit> produits;


    public Commande(Client client) {
        this.client = client;
        produits=new ArrayList<>();
    }

    public Client getClient() {
        return this.client;
    }

    public void ajouterProduit(Produit produit){
        produits.add(produit);
    }

    public ArrayList<Produit> getProduits() {
        return produits;
    }
}
