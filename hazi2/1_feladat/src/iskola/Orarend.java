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
public class Orarend {

    private String nap;
    private Ora[] órák;
    private int számláló;

    public Orarend(String nap) {
        this.nap = nap;
        this.számláló = 0;
        this.órák = new Ora[12];
    }

    public String getNap() {
        return nap;
    }

    public Ora[] getÓrák() {
        return órák;
    }

    public int getSzámláló() {
        return számláló;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public void setÓrák(Ora[] órák) {
        this.órák = órák;
    }

    public void setSzámláló(int számláló) {
        this.számláló = számláló;
    }

    @Override
    public String toString() {
        System.out.println("Nap: " + nap);
        System.out.println("Órák száma: " + számláló);
        for (int i = 0; i < órák.length; i++) {
            if (órák[i]!= null) {
                System.out.println(órák[i].toString());
            }
        }
        return "";
    }

    public boolean oratHozzad(Ora o) {
        if (this.számláló == 12) {
            return false;
        }
        int elsőLyukasÓraIndexe = 0;
        for (int i = 0; i < órák.length; i++) {
            if (órák[i] == null) {
                elsőLyukasÓraIndexe = i;
            } else if (órák[i].getKezdet() == o.getKezdet()) {
                return false;
            }

        }
        órák[elsőLyukasÓraIndexe] = o;
        this.számláló++;
        return true;
    }

}
