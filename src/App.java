import aaANTDRON2K25.*;
public class App {

    public static void main(String[] args) {

        aaInformacion info = new aaInformacion("AlomotoAriana", 1726965542);

        info.aaMostrarInformacion();
        info.leerCSV(); 
        info.aaDatosCoordenadas();

        aaBomba sistema = new aaBomba();
        sistema.ejecutar(info);
    }
}