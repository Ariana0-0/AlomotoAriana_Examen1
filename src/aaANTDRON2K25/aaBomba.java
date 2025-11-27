package aaANTDRON2K25;
import java.util.ArrayList;
import java.util.List;

public class aaBomba {

    public void ejecutar(List<aaCoordenada> aaLista) {

        aaAntCiberDron dron = new aaAntCiberDron();
        System.out.println("\n ANALIZANDO ARSENALES ");

        for (aaCoordenada c : aaLista) {
            String arsenal = c.getAaTipoArsenal();

            if (dron.aaBuscar(arsenal)) {
                System.out.println("Arsenal: " + arsenal + " → DESTRUIDO");
            } else {
                System.out.println("Arsenal " + arsenal + " no coincide con el patrón.");
            }
        }
    }
}
