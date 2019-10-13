/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IzzasztoFeladat;

/**
 *
 * @author Husika
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Elem {

    String Varos;
    int Fok;

    public Elem(String Varos, int Fok) {
        this.Varos = Varos;
        this.Fok = Fok;
    }

    public String getVaros() {
        return Varos;
    }

    public int getFok() {
        return Fok;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        int n;
        String Telepules;
        n = Integer.parseInt(sor.split(" ")[0]);
        Telepules = sor.split(" ")[1];
        ArrayList<Elem> lista = new ArrayList();
        boolean voltTelepules = false;
        int varos_fok = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sor = sc.nextLine();
            String varos = sor.split(":")[0];
            if (varos.equals(Telepules)) {
                voltTelepules = true;
            }
            int fok = Integer.parseInt(sor.split(":")[1]);
            lista.add(new Elem(varos, fok));
            if (varos.equals(Telepules)) {
                varos_fok = fok;
            }
        }
        if (!voltTelepules) {
            System.out.println("Missing data");
        } else {
            lista.sort(Comparator
                    .comparing(Elem::getFok, Comparator.reverseOrder())
                    .thenComparing(Elem::getVaros)
            );
            for (int i = 0; i < lista.size(); i++) 
                if (lista.get(i).Fok > varos_fok) {
                    System.out.println(lista.get(i).Varos + " (" + lista.get(i).Fok + ")");
                }
           
        }
    }

}
