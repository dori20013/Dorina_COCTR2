/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BudapestKupa1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Tura {

    int Ev, Honap, Nap;
    String Honap_s, Nap_s;
    String Tura_neve;
    int Ossz_tav;

    public Tura(int Ev, int Honap, int Nap, String Honap_s, String Nap_s, String Tura_neve, int Ossz_tav) {
        this.Ev = Ev;
        this.Honap = Honap;
        this.Nap = Nap;
        this.Honap_s = Honap_s;
        this.Nap_s = Nap_s;
        this.Tura_neve = Tura_neve;
        this.Ossz_tav = Ossz_tav;
    }

    public int getEv() {
        return Ev;
    }

    public int getHonap() {
        return Honap;
    }

    public int getNap() {
        return Nap;
    }

    public String getTura_neve() {
        return Tura_neve;
    }

    public int getOssz_tav() {
        return Ossz_tav;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tura> lista = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int N = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < N; i++) {
            String sor = sc.nextLine();
            String[] tok = sor.split(";");
            int ev = Integer.parseInt(tok[0]);
            int honap = Integer.parseInt(tok[1]);
            int nap = Integer.parseInt(tok[2]);
            String tura_neve = tok[3];
            int ossz = 0;

            for (int j = 4; j < tok.length; j++) {
                ossz += Integer.parseInt(tok[j]);
            }
            
            if (ossz > max) {
                max = ossz;
            }

            lista.add(new Tura(ev, honap, nap, tok[1], tok[2], tura_neve, ossz));
        }
        lista.sort(Comparator
                .comparing(Tura::getEv)
                .thenComparing(Tura::getHonap)
                .thenComparing(Tura::getNap)
                .thenComparing(Tura::getTura_neve)
        );
        for (int i = 0; i < lista.size(); i++) {
            if(max==lista.get(i).Ossz_tav)
            System.out.println(lista.get(i).Ev + ";" + lista.get(i).Honap_s + ";" + lista.get(i).Nap_s + ";" + lista.get(i).Tura_neve);
        }
    }

}
