/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat3;

import java.util.ArrayList;

/**
 *
 * @author Husika
 */
public class Teszt {

    public static void main(String[] args) {
        VendéglátóipariEgység[] tömb = new VendéglátóipariEgység[10];
        tömb[0] = new Étterem("Enni", 43, new String[]{"cukor", "tej"});
        tömb[1] = new Étterem("AAA", 10, new String[]{"palacsinta", "pali", "pilcsi"});
        tömb[2] = new Étterem("Aa1", 10, new String[]{"barack", "kávé", "alma", "ananász"});
        tömb[3] = new Étterem("Valóság", 10, new String[]{"viz", "kenyér", "kicsifizetés"});
        tömb[4] = new Étterem("Area51", 10, new String[]{"pizza", "torta", "aranynyaklánc"});
        tömb[5] = new Kocsma("Ibi", 1000, new String[]{"bármi", "amit", "csak", "megkivánsz"});
        tömb[6] = new Kocsma("Vali", 840, new String[]{"majdnem", "bármi", "amit", "csak", "megkivánsz"});
        tömb[7] = new Kocsma("PIxi", 500, new String[]{"csak", "tele", "alkeszekkel"});
        tömb[8] = new Kocsma("Fácán", 135, new String[]{"itt", "pizzázni", "is", "lehet"});
        tömb[9] = new Kocsma("Roncs", 1430, new String[]{"drága", "hely", "nem", "kolisnak", "való"});

        for (Kocsma kocsma : adottItaltKínálóKocsmák("csak", tömb)) {
            System.out.println(kocsma.getNév());
        }
    }

    public static Kocsma[] adottItaltKínálóKocsmák(String ital, VendéglátóipariEgység[] t) {
        ArrayList<Kocsma> lista = new ArrayList<>();

        for (int i = 0; i < t.length; i++) {
            if (t[i] instanceof Kocsma) {
                String[] myKocsma = ((Kocsma) t[i]).getSörlap();
                for (int j = 0; j < myKocsma.length; j++) {
                    if (myKocsma[j].equals(ital)) {
                        lista.add((Kocsma) t[i]);
                    }
                }
            }
        }
        Kocsma[] találtKocsmák = new Kocsma[lista.size()];
        találtKocsmák = lista.toArray(találtKocsmák);
        return találtKocsmák;

    }
}
