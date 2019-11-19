/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;



/**
 *
 * @author Husika
 */
public class Ital implements Comparable<Ital>{

    protected String név;
    protected String kiszerelés;
    protected int ár;

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    @Override
    public String toString() {
        return név + ", " + kiszerelés + ", " + ár + " Ft";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null || !(obj instanceof Ital)) {
            Ital o = (Ital) obj;
            if (this.név.equals(o.név) && this.kiszerelés.equals(o.kiszerelés)) {
                return true;
            }
        }
        return false;
    }

    public int compareTo(Ital i) {
        if (this.ár == i.ár) {
            return 0;
        } else if (this.ár > i.ár) {
            return 1;
        }
        return -1;

    }

}
