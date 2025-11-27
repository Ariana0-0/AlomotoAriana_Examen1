package aaANTDRON2K25;

public class aaAutomata {

    public boolean aaAceptar(String aaCadena) {
        if (aaCadena == null || aaCadena.isEmpty()) return false;

        int i = 0;
        char[] c = aaCadena.toCharArray();

        if (c[i] != 'a') return false;
        i++;

        while (i < c.length && c[i] == 'b') i++;

        if (i == c.length) return true;

        if (i < c.length && c[i] == 'c') {
            i++;
            while (i < c.length && c[i] == 'd') i++;
            return i == c.length;
        }

        return false;
    }
}