/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

/**
 *
 * @author Husika
 */
public class Ora {

    private int kód;
    private String név;
    private int kezdet;

    public Ora(int kód, String név, int kezdet) {
        this.kód = kód;
        this.név = név;
        if (kezdet >= 8 && kezdet <= 19) {
            this.kezdet = kezdet;
        } else if (kezdet < 8) {
            this.kezdet = 8;
        } else {
            this.kezdet = 19;
        }
    }

    public int getKód() {
        return kód;
    }

    public String getNév() {
        return név;
    }

    public int getKezdet() {
        return kezdet;
    }

    public void setKód(int kód) {
        this.kód = kód;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setKezdet(int kezdet) {
        this.kezdet = kezdet;
    }

    @Override
    public String toString() {
        return "Az óra kódja: " + kód + ", neve: " + név + ", kezdete:" + kezdet;
    }
    

}
