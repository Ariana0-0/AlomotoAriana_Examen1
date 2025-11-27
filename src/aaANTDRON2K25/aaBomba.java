package aaANTDRON2K25;
import java.util.List;
//Refactorización de creo la clase bomba (en el digrama esta dentro de otra clase)
public class aaBomba {

    public void ejecutar(List<aaCoordenada> aaLista) {

        aaAntCiberDron dron = new aaAntCiberDron();
        System.out.println("\n Inicializando AntCiberDron ");
        System.out.println("Arsenal  |  Tipo Arsenal  | Acción ");
        for (aaCoordenada c : aaLista) {
            String coordenada = c.getAaGeoposicion();
            String arsenal = c.getAaTipoArsenal();
            if (dron.aaBuscar(arsenal)) {
                System.out.println( coordenada + " | " + arsenal + "          | DESTRUIDO");
            } else {
                System.out.println(coordenada + " | " + arsenal + "          | no destruido");
            }
        }
    }
}
