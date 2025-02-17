import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

       Produit p1= new Produit("Pomme", 1.5, "Fruits");
        Produit p2=  new Produit("Banane", 2.0, "Fruits");
        Produit p3= new Produit("Pain", 3.0, "Boulangerie");
        Produit p4= new Produit("Lait", 2.5, "Laitier");
        Produit p5= new Produit("Yaourt", 1.8, "Laitier");
        Produit p6= new Produit("Poire", 2.2, "Fruits");

        ArrayList<Produit> produits=new ArrayList<>();
        produits.add(p1);
        produits.add(p2);
        produits.add(p3);
        produits.add(p4);
        produits.add(p5);
        produits.add(p6);


        List<Produit> produitsFruits = produits.stream()
                .filter((p) -> p.getCategorie().equals("Fruits"))
                .collect(Collectors.toList());

        produitsFruits.forEach((fruit)-> System.out.println(fruit.getNom()));


        double montantTotal=produitsFruits
                .stream()
                .mapToDouble((p)->p.getPrix()).sum();
        System.out.println(montantTotal);


    }
}