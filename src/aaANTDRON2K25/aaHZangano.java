package aaANTDRON2K25;
import aaANTDRON2K25.aaComida.*;

public class aaHZangano implements IHormiga {
    @Override
    public boolean aaComer(aaAlimento alimento) {
        if (alimento instanceof aaOmnivoro) {
            System.out.println("El zángano come carne y plantas.");
            return true;
        }
        System.out.println("El zángano NO puede comer este alimento.");
        return false;
    }
    
}
