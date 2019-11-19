package feladat1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Husika
 */
public class Main {

    Bor[] borok;

    public static Aszu[] csakAszu(Bor[] b) {

        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] instanceof Aszu) {
                Aszu a = (Aszu) b[i];
                if (a.hanyPuttonyos() == 5) {
                    count++;
                }
            }
        }
        Aszu[] aszutomb = new Aszu[count];
        count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] instanceof Aszu) {
                Aszu a = (Aszu) b[i];
                if (a.hanyPuttonyos() == 5) {
                    aszutomb[count++] = a;
                }
            }
        }
        return aszutomb;
    }

    public static void main(String[] args) {
        Bor[] b1 = new Bor[5];
        b1[0] = new Bor("Hárslevelű", "Tokaj", "Edes", 7.5);
        b1[1] = new Aszu(5, "Aszu", "Tokaj", "Edes", 8.3);
        b1[2] = new Aszu(5, "Aszu", "Tokaj", "Edes", 7.8);
        b1[3] = new Bor("Hárslevelű", "Villány", "FelEdes", 9.3);
        b1[4] = new Bor("Kékszőlő", "Eger", "Szaraz", 7.9);

        Aszu[] asz = csakAszu(b1);

        for (Aszu j : asz) {
            System.out.println(j);
        }
    }
}
