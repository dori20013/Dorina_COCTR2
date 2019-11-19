package feladat3;

public interface Rendezheto<T> {
    public boolean egyenlo(T o);
    public boolean nagyobbMint(T o);
    public boolean kisebbMint(T o);
}