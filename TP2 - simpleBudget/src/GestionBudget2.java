public class GestionBudget2 {

    private double solde;
    private double montantDepense;

    public GestionBudget2() {
        this.solde=1000;
    }

    public void setMontantDepense(double montantDepense) {
        this.montantDepense = montantDepense;
    }

    public double getSolde() {
        this.solde = this.solde - this.montantDepense;
        return this.solde;

    }


}
