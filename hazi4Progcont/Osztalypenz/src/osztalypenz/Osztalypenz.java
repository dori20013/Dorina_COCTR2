/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osztalypenz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Husika
 */
public class Osztalypenz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Zh> lista = new ArrayList<>();

        while (sc.hasNextLine()) {
            String sor = sc.nextLine();
            if(sor.equals("a"))break;
            String[] token = sor.split(";");

            Zh tok = new Zh(token[0], Integer.parseInt(token[1]));

            if (!lista.contains(tok)) {
                lista.add(tok);
            } else {
                int index = lista.indexOf(tok);
                lista.get(index).setEredmeny(lista.get(index).getEredmeny() + Integer.parseInt(token[1]));
            }
        }
        Collections.sort(lista);

        for (Zh i : lista) {
            System.out.println(i);
        }
    }
    
}

class Zh implements Comparable<Zh> {

    private String Nev;
    private int Eredmeny;

    public void setNev(String Nev) {
        this.Nev = Nev;
    }

    public void setEredmeny(int Eredmeny) {
        this.Eredmeny = Eredmeny;
    }

    public String getNev() {
        return Nev;
    }

    public int getEredmeny() {
        return Eredmeny;
    }

    public Zh(String Nev, int Eredmeny) {
        this.Nev = Nev;
        this.Eredmeny = Eredmeny;
    }

    @Override
    public String toString() {
        return Nev + ": " + Eredmeny + " pont";
    }

    @Override
    public int compareTo(Zh o) {
        if (this.Eredmeny == o.Eredmeny) {
            return this.Nev.compareTo(o.Nev);
        }

        return o.Eredmeny - this.Eredmeny;

    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Zh other = (Zh) obj;
        if (!Objects.equals(this.Nev, other.Nev)) {
            return false;
        }
        return true;
    }

}
