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
public class Teszt {

    public static Katona megkuzd(Katona elsőKatona, Katona másodikKatona) {
        System.out.println(elsőKatona + " \tVS\t " + másodikKatona);
        Katona nyertes;
//első módszer
        int elsőCsapás = elsőKatona.getTámadóErő() - másodikKatona.getVédőErő();
        int másodikCsapás = másodikKatona.getTámadóErő() - elsőKatona.getVédőErő();
        if (elsőCsapás >= másodikCsapás) {
            nyertes = elsőKatona;
        } else {
            nyertes = másodikKatona;
        }
//vagy második módszer
//        if (elsőKatona.getTámadóErő() >= másodikKatona.getVédőErő()) {
//            nyertes = elsőKatona;
//        } else {
//            nyertes = másodikKatona;
//        }
        System.out.println(" Nyert: " + nyertes);
        return nyertes;
    }

    public static void main(String[] args) {
        Katona Bob = new Nyilas(20, 80, 150);
        Katona Pityu = new Nyilas(50, 150, 100);
        Katona MariNéni = new Landzsas(250, 250);
        megkuzd(Bob, Pityu);
        megkuzd(megkuzd(Bob, Pityu), MariNéni);
    }
}
