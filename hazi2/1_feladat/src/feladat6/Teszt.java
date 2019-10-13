/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat6;

import java.util.Random;

/**
 *
 * @author Husika
 */
public class Teszt {

    public static boolean isConsecutiveFour(int[] values) {
        if (values.length < 4) {
            return false;
        }
        int db = 1;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) {
                db++;
            } else {
                db = 1;
            }
            if (db == 4) {
                return true;
            }
        }
        return false;
    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] t = new int[150];
        int[] k = new int[3];
        int[] helyes = new int[]{2, 4, 5, 6, 6, 6, 6, 5, 4,};
        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(10);
        }
        for (int i = 0; i < k.length; i++) {
            k[i] = rnd.nextInt(10);
        }
        printArray(k);
        System.out.println(isConsecutiveFour(k));
        System.out.println("");
        printArray(t);
        System.out.println(isConsecutiveFour(t));
        System.out.println("");
        printArray(helyes);
        System.out.println(isConsecutiveFour(helyes));

    }
}
