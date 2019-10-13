/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasfelMillioLepes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Ember {

    String nev;
    int kek, mas_szin;

    public Ember(String nev, int kek, int mas_szin) {
        this.nev = nev;
        this.kek = kek;
        this.mas_szin = mas_szin;
    }

    public String getNev() {
        return nev;
    }

    public int getKek() {
        return kek;
    }

    public int getMas_szin() {
        return mas_szin;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Ember> lista = new ArrayList<>();
        int N = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < N; i++) {
            String sor = sc.nextLine();
            String name = sor.split(";")[0];
            String ut = sor.split(";")[1];
            int kek = 0;
            int tobbi = 0;
            for (int j = 0; j < ut.length(); j++) {
                if (ut.charAt(j) == 'K') {
                    kek++;
                }
                if (ut.charAt(j) != 'K' && ut.charAt(j) != '.') {
                    tobbi++;
                }
            }
            lista.add(new Ember(name, kek, tobbi));
        }

        lista.sort(Comparator
                .comparing(Ember::getKek).reversed()
                .thenComparing(Ember::getMas_szin).reversed()
                .thenComparing(Ember::getNev)
        );
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (lista.get(j).kek < lista.get(j + 1).kek) {
                    Collections.swap(lista, j, j + 1);
                } else if (lista.get(j).kek == lista.get(j + 1).kek) {
                    if (lista.get(j).mas_szin < lista.get(j + 1).mas_szin) {
                        Collections.swap(lista, j, j + 1);
                    } else if (lista.get(j).mas_szin == lista.get(j + 1).mas_szin) {
                        if (lista.get(j).nev.compareTo(lista.get(j + 1).nev) > 0) {
                            Collections.swap(lista, j, j + 1);
                        }

                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(lista.get(i).nev);
        }
    }

}
