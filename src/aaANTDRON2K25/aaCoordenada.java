package aaANTDRON2K25;



class aaCoordenada {
    private String aaGeoposicion;
    private String aaLunes;
    private String aaMarteS;
    private String aaMiercoles;
    private String aaJueves;
    private String aaViernes;
    private String aaTipoArsenal;



    public aaCoordenada(String aaGeoposicion, String aaLunes, String aaMarteS, String aaMiercoles, String aaJueves, String aaViernes, String aaTipoArsenal) {
        this.aaGeoposicion = aaGeoposicion;
        this.aaLunes = aaLunes;
        this.aaMarteS = aaMarteS;
        this.aaMiercoles = aaMiercoles;
        this.aaJueves = aaJueves;
        this.aaViernes = aaViernes;
        this.aaTipoArsenal = aaTipoArsenal;
    }
    public String getAaGeoposocion() {
        return aaGeoposicion;
    
    }
    public String getAaLunes() {
        return aaLunes;
    }
    public String getAaMarteS() {
        return aaMarteS;
    }
    public String getAaMiercoles() {
        return aaMiercoles;
    }
    public String getAaJueves() {
        return aaJueves;
    }
    public String getAaViernes() {
        return aaViernes;
    }
    public String getAaTipoArsenal() {
        return aaTipoArsenal;
    }



}