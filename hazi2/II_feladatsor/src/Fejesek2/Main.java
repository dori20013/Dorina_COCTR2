/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fejesek2;
 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] token = sc.nextLine().split(";");
        Diák[] d = new Diák[Integer.parseInt(token[0])];
        d[0] = new Diák(token[1], "", "piros");
        String kit = token[2];
        for (int i = 1; i < d.length; i++) {
            token = sc.nextLine().split(";");
            d[i] = new Diák(token[0], token[1], "");
        }

        for (int i = 1; i < d.length; i++) {
            int k = i;
            while(k < d.length) {
                if (d[k].getElozo().equals(d[i-1].getNev())) {
                    if (d[i-1].getSapka().equals("piros"))
                        d[k].setSapka("kék");
                    else
                        d[k].setSapka("piros");

                    Diák tmp = d[i];
                    d[i] = d[k];
                    d[k] = tmp;
                    break;
                }
                k++;
            }
        }

        int piros = 0;
        int kék = 0;
        /* sajĂˇt for, ehhez a szĂ­neket -1-rĹ‘l kell indĂ­tani, Ă©s utĂˇna kĂĽlĂ¶n kiĂ­rni:
        for (int i = 0; i < d.length; i++) {
            if (d[i].getSapka().equals("piros"))
                piros++;
            else kék++;
        }*/

        for (int i = 0; i < d.length; i++) {
            if (d[i].getNev().equals(kit))
                System.out.println(piros + " " + kék);

            if (i%2 == 0)
                piros++;
            else
                kék++;
        }
    }
}
 class Diák {
    String nev;
    String elozo;
    String sapka;

    public Diák(String nev, String elozo, String sapka) {
        this.nev = nev;
        this.elozo = elozo;
        this.sapka = sapka;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getElozo() {
        return elozo;
    }

    public void setElozo(String elozo) {
        this.elozo = elozo;
    }

    public String getSapka() {
        return sapka;
    }

    public void setSapka(String sapka) {
        this.sapka = sapka;
    }

    @Override
    public String toString() {
        return "Diák {" +
                "nev='" + nev + '\'' +
                ", elozo='" + elozo + '\'' +
                ", sapka='" + sapka + '\'' +
                '}';
    }
}