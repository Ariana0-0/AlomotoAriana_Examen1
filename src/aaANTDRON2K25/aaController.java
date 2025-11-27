package aaANTDRON2K25;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class aaController {

    private List<aaCoordenada> aaCoordenadas = new ArrayList<>();
    private aaInformacion info;

    public void aainiciarSistema() {
        info = new aaInformacion("Ariana Alomoto", 1726965542);
        info.aaMostrarInformacion();
    }



    private void aaCargarSpinner() throws InterruptedException {
        char[] spin = {'o', 'O', 'o'};
        int j = 0;
        for (int i = 0; i <= 100; i++) {
            if (j == 3) j = 0;
            System.out.print( spin[j] + "  " + i + "%\r");
            j++;
            Thread.sleep(10);
        }
        System.out.println( "");
    }


    public void aaMostrarCSV() {
        
        InputStream aa = getClass().getClassLoader().getResourceAsStream("AlomotoAriana.csv");
        if (aa == null) {
            System.out.println("No se encontró el archivo.");
            return;
        }
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(aa,"UTF-8" ))) {
            String aaLinea;
            while ((aaLinea = br.readLine()) != null) {
                aaCargarSpinner();
                System.out.println(aaLinea);
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
                    aaCoordenada aaCoord = new aaCoordenada(
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
    public List<aaCoordenada> getAaCoordenadas() {
        return aaCoordenadas;
    }


}