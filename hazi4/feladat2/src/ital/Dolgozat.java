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
public class Dolgozat {

    public static SzeszesItal[] topHáromAlkoholtartalom(Ital[] italok) {

        SzeszesItal[] result = new SzeszesItal[3];
        Ital[] másolat = italok;

        for (int j = 0; j < 3; j++) {
            double max = 0;
            int index = 0;
            int db = 0;
            for (int i = 0; i < másolat.length; i++) {
                if (másolat[i] != null && (másolat[i] instanceof SzeszesItal)) {
                   if(j==0) db++;
                    SzeszesItal tmp = (SzeszesItal) másolat[i];
                    if (tmp.getAlkoholTartalom() > max) {
                        max = tmp.getAlkoholTartalom();
                        index = i;
                    }
                }
            }
            if (j == 0) {
                if (db < 3) {
                    return null;
                }
            }
            result[j] = (SzeszesItal) másolat[index];
            másolat[index] = null;
        }
        return result;
    }
}
