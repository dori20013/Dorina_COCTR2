/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat5;

/**
 *
 * @author Husika
 */
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] t = new int[30];
        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(10);
        }
        printArray(t);
        long timeStart = System.currentTimeMillis();
        insertionSort(t);
        long timeEnd = System.currentTimeMillis();
        printArray(t);
        System.out.println(timeEnd - timeStart);
    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int s = i - 1;
            while (s >= 0 && a[s] > a[s + 1]) {
                int tmp = a[s];
                a[s] = a[s + 1];
                a[s + 1] = tmp;
                s = s - 1;
            }

        }
    }
}
