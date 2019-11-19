/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Husika
 */
public class Main {

    public static void main(String[] args) {
        Ital[] italok = new Ital[8];
        italok[0] = new SzeszesItal(4, "Soproni", "0,5 l", 298);
        italok[1] = new SzeszesItal(5, "Borsodi", "0,5 l", 310);
        italok[2] = new Ital("Coca-Cola", "1,75 l", 350);
        italok[3] = new Ital("Marka", "2 l", 270);
        italok[4] = new SzeszesItal(6, "Staropramen", "1 l", 460);
        italok[5] = new Ital("Pepsi-Cola", "0,33 l", 160);
        italok[6] = new Ital("Apenta", "1,5 l", 280);
        italok[7] = new SzeszesItal(4.5, "Kőbányai", "2 l", 530);
        SzeszesItal[] aNagyŐk = Dolgozat.topHáromAlkoholtartalom(italok);
        if (aNagyŐk != null) {
            for (int i = 0; i < aNagyŐk.length; i++) {
                System.out.println(aNagyŐk[i].toString());
            }
        }
        Arrays.sort(aNagyŐk);
        System.out.println("");
        if (aNagyŐk != null) {
            for (int i = 0; i < aNagyŐk.length; i++) {
                System.out.println(aNagyŐk[i].toString());
            }
        }
        
    }

}
