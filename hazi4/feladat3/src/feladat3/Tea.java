package feladat3;

public class Tea<T> implements Rendezheto<T> {
    public String nev;
    public int ar;

    public Tea(String s, int j) {
        nev = s;
        ar = j;
    }

    @Override
    public boolean egyenlo(T o) {
        return this.ar == ((Tea) o).ar;
    }

    @Override
    public boolean nagyobbMint(T o) {
        return this.ar > ((Tea) o).ar;
    }

    @Override
    public boolean kisebbMint(T o) {
        return this.ar < ((Tea) o).ar;
    }
}