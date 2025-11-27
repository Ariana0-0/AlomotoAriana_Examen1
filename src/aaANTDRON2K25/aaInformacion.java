package aaANTDRON2K25;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import aaANTDRON2K25.Coordenada;

public class aaInformacion {

    private String aaNombre;
    private int aaCedula;
    private List<Coordenada> aaCoordenadas = new ArrayList<>();

    public aaInformacion(String aaNombre, int aaCedula) {
        this.aaNombre = aaNombre;
        this.aaCedula = aaCedula;
    }


    public void aaMostrarInformacion() {
        System.out.println("Nombre: " + aaNombre);
        System.out.println("Cédula: " + aaCedula);
    }
    public void leerCSV() {
    InputStream is = getClass().getClassLoader().getResourceAsStream("AlomotoAriana.csv");

    if (is == null) {
        System.out.println("No se encontró el archivo.");
        return;
    }

    try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}


    public void aaDatosCoordenadas(){
        System.out.println("Cargando coordenadas");
        try {
            InputStream is = getClass().getClassLoader().getResourceAsStream("AlomotoAriana.csv");
            BufferedReader aaLector = new BufferedReader(new InputStreamReader(is));
            String aaLinea;
            boolean aaPrimeraLinea = true;
            int aaLineasCargadas = 0;
            while ((aaLinea = aaLector.readLine()) != null) {
                if (aaPrimeraLinea) {
                    aaPrimeraLinea = false; 
                    continue; 
                }
                String[] aaValores = aaLinea.split(";", -1);
                if (aaValores.length >= 7) {
                    Coordenada aaCoord = new Coordenada(
                        aaValores[0].trim(),
                        aaValores[1].trim(),
                        aaValores[2].trim(),
                        aaValores[3].trim(),
                        aaValores[4].trim(),
                        aaValores[5].trim(),  
                        aaValores[6].trim()

                    );
                    aaCoordenadas.add(aaCoord);
                    aaLineasCargadas++;
                }
            }
            
            aaLector.close();
            System.out.println("Coordenadas cargadas:" + aaLineasCargadas);
        }
        catch (IOException e) {
            System.out.println("Error al leer el archivo de coordenadas: " + e.getMessage());
        }

    }



    public String getAaNombre() {
        return aaNombre;
    }
    public int getAaCedula() {
        return aaCedula;
    }

    public List<Coordenada> getAaCoordenadas() {
        return aaCoordenadas;
    }

    
    
}
