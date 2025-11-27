package aaANTDRON2K25;

public class aaBomba {

       public void ejecutar(aaInformacion info) {

        aaAntCiberDron dron = new aaAntCiberDron();
        System.out.println("\n ANALIZANDO ARSENALES ");

        for (Coordenada c : info.getAaCoordenadas()) {
            String arsenal = c.getAaTipoArsenal();

            if (dron.aaBuscar(arsenal)) {
                System.out.println("Arsenal encontrado: " + arsenal + " → DESTRUIDO");
            } else {
                System.out.println("Arsenal " + arsenal + " no coincide con el patrón.");
            }
        }
    } 
    
}
