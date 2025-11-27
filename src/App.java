import aaANTDRON2K25.*;
import aaANTDRON2K25.aaComida.aaOmnivoro;


public class App {

    public static void main(String[] args) {

        aaController controller = new aaController();

        controller.aainiciarSistema();
        controller.aaMostrarCSV(); 
        controller.aaDatosCoordenadas();
        aaHZangano zangano = new aaHZangano();
        aaOmnivoro alimento = new aaOmnivoro();
        zangano.aaCrear();
        zangano.aaComer(alimento);
        aaBomba sistema = new aaBomba();
        sistema.ejecutar(controller.getAaCoordenadas());

    }
}