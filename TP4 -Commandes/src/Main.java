//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Client client=new Client("Dupont", "jean");

      Produit p1=new Produit("Velo", "lorem ipsum");
      Produit p2=new Produit("Micro", "lorem ipsum");


      Commande commande=new Commande(client);

      commande.ajouterProduit(p1);
      commande.ajouterProduit(p2);


      Client clientDeLaCommande   =   commande.getClient();

      String nomDuCLientDeLaCOmmande=clientDeLaCommande.getNom();


        System.out.println(" COMMANDE : nom client :"+commande.getClient().getNom());


        for(int i=0; i<commande.getProduits().size();i++){
            System.out.println(commande.getProduits().get(i).getLibelle());
        }

    }
}