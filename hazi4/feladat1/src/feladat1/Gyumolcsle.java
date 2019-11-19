package feladat1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Husika
 */
public abstract class Gyumolcsle extends Ital {

    public Gyumolcsle(Gyumolcs gy) {
    }

    public abstract String mibolFacsartak();

    @Override
    public abstract String mibolKeszult();

    @Override
    public abstract String milyenIzu();

    @Override
    public String toString() {
        return "Gyumolcsle{}";
    }

}
