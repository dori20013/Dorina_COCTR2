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
public class Katona {
    private int támadóErő;
    private int védőErő;

    public Katona() {
        this.támadóErő = 5;
        this.védőErő = 5;
    }

    public Katona(int támadóErő, int védőErő) {
        this.támadóErő = támadóErő;
        this.védőErő = védőErő;
    }
    

    
    public int getTámadóErő() {
        return támadóErő;
    }

    public int getVédőErő() {
        return védőErő;
    }

    public void setTámadóErő(int támadóErő) {
        this.támadóErő = támadóErő;
    }

    public void setVédőErő(int védőErő) {
        this.védőErő = védőErő;
    }

    @Override
    public String toString() {
        return "TE: [" + támadóErő + "], VE:[" + védőErő + ']';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Katona other = (Katona) obj;
        if (this.támadóErő != other.támadóErő) {
            return false;
        }
        if (this.védőErő != other.védőErő) {
            return false;
        }
        return true;
    }
    
    
    
}
