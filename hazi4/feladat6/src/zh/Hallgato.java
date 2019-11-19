package zh;

import java.util.concurrent.ThreadLocalRandom;

public class Hallgato {

    private int mennyitKeszult;
    private boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }

    @Override
    public String toString() {
        return "Hallgato{"
                + "mennyitKeszult=" + mennyitKeszult
                + ", sokatTanul=" + sokatTanul
                + '}';
    }

    public Dolgozat dolgozatotIr() {
        int pontszam = 0;
        int veletlen = 0;
        if (sokatTanul) {
            veletlen = ThreadLocalRandom.current().nextInt(4, 7 + 1);
            pontszam = mennyitKeszult * veletlen;
        } else {
            veletlen = ThreadLocalRandom.current().nextInt(0, 5 + 1);
            pontszam = mennyitKeszult * veletlen;
        }

        Dolgozat d1 = new Dolgozat(pontszam);

        return d1;
    }
}
