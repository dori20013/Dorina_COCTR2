/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_1;

/**
 *
 * @author Husika
 */
public class Nyilas extends Katona {

    private int lőtáv;

    public int getLőtáv() {
        return lőtáv;
    }

    public Nyilas(int lőtáv, int támadóErő, int védőErő) {
        super(támadóErő, védőErő);
        this.lőtáv = lőtáv;
    }

    public void setLőtáv(int lőtáv) {
        this.lőtáv = lőtáv;
    }

    public int getTámadóErő() {
        return (lőtáv + super.getTámadóErő());
    }

    @Override
    public String toString() {
        return "Nyilas: TE: [" + getTámadóErő() + "], VE: [" + getVédőErő() + ']';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nyilas other = (Nyilas) obj;
        if (this.lőtáv != other.lőtáv) {
            return false;
        }
        if (this.getTámadóErő() != other.getTámadóErő()) {
            return false;
        }
        if (this.getVédőErő() != other.getVédőErő()) {
            return false;
        }
        return true;
    }

}
