package feladat10;

import java.util.Objects;

public class Autó implements Comparable<Autó> {
    private static int peldanyszam;

    private String rendszám;
    private int teljesítmény;
    private boolean automata;
    private String extrak;

    public Autó(String rendszám, int teljesítmény, boolean automata) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
        this.extrak = "";

        peldanyszam++;
    }

    public static int getPeldanyszam() {
        return peldanyszam;
    }

    public void setExtrak(String extrak) {
        this.extrak = extrak;
    }

    public boolean szabalyose(String rendszám) {
        boolean ret = true;
        for (int i = 0; i < rendszám.length(); i++) {
            if (i < 3) {
                if (!Character.isLetter(rendszám.charAt(i)))
                    ret = false;
            }
            if (i > 2) {
                if (!Character.isDigit(rendszám.charAt(i)))
                    ret = false;
            }
        }
        return ret;
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getTeljesítmény() {
        return teljesítmény;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return "Rendszám: " + rendszám + ", teljesítmény: " + teljesítmény +
                ", automata: " + automata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autó autó = (Autó) o;
        return Objects.equals(rendszám, autó.rendszám);
    }

    @Override
    public int compareTo(Autó autó) {
        return autó.teljesítmény-this.teljesítmény;
    }
}