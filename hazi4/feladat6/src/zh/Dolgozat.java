package zh;

import egyetem.Pontozhato;

public class Dolgozat implements Pontozhato {

    private int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        if (!megfelelt()) {
            return "Nem írt";
        }
        return "Dolgozat{"
                + "pontszam=" + pontszam
                + '}';

    }

    @Override
    public boolean megfelelt() {
        if (pontszam > 35) {
            return true;
        }
        if (pontszam == -1) {
            System.out.println("Nem írt");
        }
        return false;
    }
}
