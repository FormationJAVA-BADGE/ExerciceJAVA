public class GestionBudget {


    private double solde;

    public GestionBudget() {
        this.solde = 1000;
    }

    public void ajouterDepense(Depense depense){

        this.solde=this.solde-depense.getMontant();
    }

    public double getSolde() {
        return this.solde;
    }
}
