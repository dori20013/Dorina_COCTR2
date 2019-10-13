/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

import java.util.Scanner;

/**
 *
 * @author Husika
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nap = sc.nextLine();
        int db = Integer.parseInt(sc.nextLine());
        Ora[] órákTömb = new Ora[db];
        for (int i = 0; i < db; i++) {
            órákTömb[i] = new Ora(Integer.parseInt(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        }
        Orarend orarend1 = new Orarend(nap);
        for (int i = 0; i < órákTömb.length; i++) {
            System.out.print(i+1+". ");
            System.out.println(orarend1.oratHozzad(órákTömb[i]));
        }
        System.out.println(orarend1.toString());
    }
}
