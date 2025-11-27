package aaANTDRON2K25;
import aaANTDRON2K25.aaComida.*;

public class aaHZangano implements IHormiga {
    @Override
    public boolean aaComer(aaAlimento alimento) {
        return alimento instanceof aaOmnivoro;
    }
}
