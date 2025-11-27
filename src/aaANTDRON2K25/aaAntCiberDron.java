package aaANTDRON2K25;

public class aaAntCiberDron implements IIA {

    @Override
    public boolean aaBuscar(String aaTipoArsenal) {
        aaAutomata aaA = new aaAutomata();
        return aaA.aaAceptar(aaTipoArsenal);
    }
    
}
