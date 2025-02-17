import com.example.service.IVenteService;
import com.example.service.VenteServiceImpl;

public class GestionVentePartielle {

    IVenteService service=new IVenteService() {
        @Override
        public void calculerMoyenneDesVentes() {
            System.out.println("calcul de la moyenne des ventes partielles");
        }

        @Override
        public void calculerTopVentes() {

        }


    };


    IVenteService venteGenerique=new VenteServiceImpl();
}
