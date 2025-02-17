public class GestionBudget {


    private double solde;

    public GestionBudget() {
       this.solde=1000;
    }

    public void ajouterDepense(double montant){
        this.solde= this.solde - montant;
    }

    public double getSolde(){
      return this.solde;
    }

}
