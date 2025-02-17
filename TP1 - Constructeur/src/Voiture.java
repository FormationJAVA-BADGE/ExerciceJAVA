public class Voiture {

    //ATTRIBUT
    String couleur;
    int nbreRoue;



    //Qu'est ce qu'il se passe lors de la construction de la
    // voiture si on ne donne pas de paramètres?
    public Voiture(){
        this.couleur="blanc";
        this.nbreRoue=4;
    }

    //Qu'est ce qu'il se passe lors de la construction de la voiture si on donne une couleur?
    public Voiture(String couleur, boolean isRoueSupplementaire){
        this.couleur=couleur;
        if(isRoueSupplementaire){
            this.nbreRoue=5;
        }else{
            this.nbreRoue=4;
        }
    }

    public double computePrice(){
        double prix = 0;
        if(!this.couleur.equals("blanc")){
            prix =prix+400;
        }else if(this.nbreRoue>4){
            prix=prix +200;
        }
        return prix;
    }


}
