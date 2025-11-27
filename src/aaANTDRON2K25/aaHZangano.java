package aaANTDRON2K25;
import aaANTDRON2K25.aaComida.*;


public class aaHZangano implements IHormiga {
    //Refactorización se agrego el metodo aaCrear
    public void aaCrear(){
        System.out.println("se ha creado un Zángano para que use el AntCiberDron");
    }
    @Override
    public boolean aaComer(aaAlimento alimento) {
        if (alimento instanceof aaOmnivoro) {
            System.out.println("El zángano come carne y plantas(es Omnivoro).");
            return true;
        }
        System.out.println("El zángano NO puede comer este alimento.");
        return false;
    }
    
}
