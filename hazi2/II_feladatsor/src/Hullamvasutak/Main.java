/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hullamvasutak;

/**
 *
 * @author Husika
 */
/**
 *
 * @author Husika
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


class Elem{
    String hullamvasutak_neve;
    String vilag_neve;
    int legkisebb_mag;
    int varakozasi_ido;

    public Elem(String hullamvasutak_neve, String vilag_neve, int legkisebb_mag, int varakozasi_ido) {
        this.hullamvasutak_neve = hullamvasutak_neve;
        this.vilag_neve = vilag_neve;
        this.legkisebb_mag = legkisebb_mag;
        this.varakozasi_ido = varakozasi_ido;
    }

    public String getHullamvasutak_neve() {
        return hullamvasutak_neve;
    }

    public String getVilag_neve() {
        return vilag_neve;
    }

    public int getLegkisebb_mag() {
        return legkisebb_mag;
    }

    public int getVarakozasi_ido() {
        return varakozasi_ido;
    }

}

public class Main {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Elem> lista = new ArrayList<>();
        String sor = sc.nextLine();
        int n = Integer.parseInt(sor);
        
        for (int i = 0; i < n; i++) {
            sor = sc.nextLine();
            
            String[] token = sor.split(";");
            
            String hullamvasutak_neve = token[0];
            String vilag_neve = token[1];
            int legkisebb_mag = Integer.parseInt(token[2]);
            int varakozasi_ido = Integer.parseInt(token[3]);
            
            lista.add(new Elem(hullamvasutak_neve, vilag_neve, legkisebb_mag, varakozasi_ido));
        }
        
        lista.sort(Comparator
                .comparing(Elem::getVarakozasi_ido)
                .thenComparing(Elem::getLegkisebb_mag, Comparator.reverseOrder())
                .thenComparing(Elem::getHullamvasutak_neve)
        );
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).hullamvasutak_neve + " ("+ lista.get(i).vilag_neve+"): "+ lista.get(i).varakozasi_ido);
        }
    }

}