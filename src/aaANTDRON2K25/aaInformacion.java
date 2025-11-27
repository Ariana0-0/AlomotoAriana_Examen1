package aaANTDRON2K25;

public class aaInformacion {

    private String aaNombre;
    private int aaCedula;

    public aaInformacion(String aaNombre, int aaCedula) {
        this.aaNombre = aaNombre;
        this.aaCedula = aaCedula;
    }

    public void aaMostrarInformacion() {
        System.out.println("Nombre: " + aaNombre);
        System.out.println("Cédula: " + aaCedula);
    }


    public String getAaNombre() {
        return aaNombre;
    }
    public int getAaCedula() {
        return aaCedula;
    }


    
    
}
