import com.example.service.IVenteService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IVenteService service=new IVenteService() {
            @Override
            public void calculerMoyenneDesVentes() {
                System.out.println("je calcule la moyenne des ventes classiques");
            }

            @Override
            public void calculerTopVentes() {

            }
        };

        service.calculerTopVentes();


    }
}