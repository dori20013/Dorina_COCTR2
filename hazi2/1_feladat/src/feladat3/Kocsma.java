/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat3;

/**
 *
 * @author Husika
 */
public class Kocsma extends VendéglátóipariEgység {

    private String[] sörlap;

    public Kocsma(String név, int férőhelyekSzáma, String[] sörlap) {
        super(név, férőhelyekSzáma, true);
        this.sörlap = sörlap;
    }

    public String[] getSörlap() {
        return sörlap;
    }

    @Override
    public String toString() {
        return "Kocsma{" + "sörlap=" + sörlap + '}';
    }

}
