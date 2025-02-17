import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GestionBudget budget=new GestionBudget();
        Depense courses=new Depense(100,"courses");
        budget.ajouterDepense(courses);

        Depense cinema=new Depense(12,"cinema");
        budget.ajouterDepense(cinema);

        Depense loisir=new Depense(200,"loisir");
        budget.ajouterDepense(loisir);

        System.out.println(budget.getSolde());

        Depense d1=new Depense(400,"voyage");

    }
}