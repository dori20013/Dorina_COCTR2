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
public class Aszu extends Bor{
    private int puttonySzam;

    public Aszu(int p, String sz, String t, String i, double a) {
        super(sz, t, i, a);
        this.puttonySzam = p;
    }

      
    
    
    public int hanyPuttonyos(){
        return puttonySzam;
    }

    @Override
    public String toString() {
       return "Aszú: " + super.milyenIzu() + " ízű, " + super.mennyiAlkoholtTartalmaz() + "% alkoholtartalmú, " +
                super.milyenSzolobolKeszult() + " szőlőből készült, termőterület: " + super.holTermett() + ", " +
                puttonySzam + " puttonyos.";
    }
    
}
