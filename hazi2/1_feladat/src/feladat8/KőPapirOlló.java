/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Husika
 */
public class KőPapirOlló {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String in = sc.nextLine();
        while (!in.equals("vege")) {
            if (!(in.equals("ko") || in.equals("papir") || in.equals("ollo"))) {
                System.out.println("parancs: " + in + "\nHibás parancs! Próbálj ujra!");
                in = sc.nextLine();
                continue;
            }
            int botCommand = rnd.nextInt(3);
            System.out.print("Bot: ");
            switch (botCommand) {
                case 0:
                    System.out.println("kő");
                    break;
                case 1:
                    System.out.println("papír");
                    break;
                case 2:
                    System.out.println("olló");
                    break;
                default:
                    System.out.println(botCommand);
            }
            if ((in.equals("ko") && botCommand == 1) || (in.equals("papir") && botCommand == 2) || (in.equals("ollo") && botCommand == 0)) {
                System.out.println("Bot nyert!");
            } else if ((in.equals("ko") && botCommand == 2) || (in.equals("papir") && botCommand == 0) || (in.equals("ollo") && botCommand == 1)) {
                System.out.println("Nyertél!");
            }else
                System.out.println("Döntetlen");
            in = sc.nextLine();
        }
        System.out.println("A játéknak vége!");
    }
}
