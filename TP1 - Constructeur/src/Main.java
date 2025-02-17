//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


        // Je veux fabriquer un objet de type voiture
        //declaration
        Voiture voiture; // voiture vaut null
        //Initialisation
        voiture=new Voiture();
        //On a une voiture qui se nomme voiture


        //Je veux une seconde voiture
        Voiture voiture2=new Voiture("rouge", true);

        System.out.println("voiture " +voiture.couleur);
        System.out.println("voiture2 "+voiture2.computePrice());




    }
}