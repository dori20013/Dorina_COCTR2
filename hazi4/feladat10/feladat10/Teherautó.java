package feladat10;

public class Teherautó extends Autó {
    private int teherbírás;

    public Teherautó(String rendszám, int teljesítmény, boolean automata, int teherbírás) {
        super(rendszám, teljesítmény, automata);
        this.teherbírás = teherbírás;
    }

    public int getTeherbírás() {
        return teherbírás;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + teherbírás;
    }
}
