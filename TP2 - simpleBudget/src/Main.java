//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestionBudget budget;
        budget=new GestionBudget();
        //GestionBudget budget=new GestionBudget();

        budget.ajouterDepense(500); //1000=1000-500
        budget.ajouterDepense(12);  //500=500-12
        budget.ajouterDepense(250); //488=488-250
        budget.ajouterDepense(100); //238=238-100

        GestionBudget2 budget2=new GestionBudget2();
        budget2.setMontantDepense(500);
        double result=budget2.getSolde();


        System.out.println("budget1 "+budget.getSolde());
        System.out.println("budget 2 "+result);


    }
}