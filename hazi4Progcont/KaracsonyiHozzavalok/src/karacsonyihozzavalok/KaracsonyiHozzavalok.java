/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karacsonyihozzavalok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Husika
 */
public class KaracsonyiHozzavalok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Hozzávalók> lista = new ArrayList<>();

        while (sc.hasNextLine()) {
            String[] sor = sc.nextLine().split(";");
            Hozzávalók h = new Hozzávalók(sor[0], Integer.parseInt(sor[1]));

            if (lista.contains(h)) {
                int idx = lista.indexOf(h);
                lista.get(idx).setMennyiseg(lista.get(idx).getMennyiseg() + Integer.parseInt(sor[1]));
            } else {
                lista.add(new Hozzávalók(sor[0], Integer.parseInt(sor[1])));
            }
        }
        Collections.sort(lista);

        for (Hozzávalók i : lista)
            System.out.println(i);
    }
}

class Hozzávalók implements Comparable<Hozzávalók> {

        private String nev;
        private int mennyiseg;

        public Hozzávalók(String nev, int mennyiseg) {
            this.nev = nev;
            this.mennyiseg = mennyiseg;
        }

        public String getNev() {
            return nev;
        }

        public void setNev(String nev) {
            this.nev = nev;
        }

        public int getMennyiseg() {
            return mennyiseg;
        }

        public void setMennyiseg(int db) {
            this.mennyiseg = db;
        }

        @Override
        public String toString() {
            return this.nev + ";" + this.mennyiseg;
        }

        @Override
        public int compareTo(Hozzávalók o) {
            if (this.mennyiseg != o.mennyiseg)
                return o.mennyiseg-this.mennyiseg;
            else return this.nev.compareTo(o.nev);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Hozzávalók))
                return false;

            Hozzávalók h = (Hozzávalók) obj;

            return this.nev.equals(h.getNev());

        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 29 * hash + Objects.hashCode(this.nev);
            return hash;
        }
}
