
public class Main {

    public static void main(String[] args) {
        Pont pont1 = new Pont(0, 0);
        Pont pont2 = new Pont(0, 0);
        Pont pont3 = new Pont(0, 0);
        Pont pont4 = new Pont(0, 0);
        pont1.setY(pont1.getY() + 5);
        pont2.setY(pont2.getY() + 5);
        pont3.setX((float) (pont3.getX() - 3.4));
        pont4.setX((float) (pont4.getX() - 3.4));
        System.out.println("1.pont: (" + pont1.getX() + ";" + pont1.getY() + ")");
        System.out.println("2.pont: (" + pont2.getX() + ";" + pont2.getY() + ")");
        System.out.println("3.pont: (" + pont3.getX() + ";" + pont3.getY() + ")");
        System.out.println("4.pont: (" + pont4.getX() + ";" + pont4.getY() + ")");
    }
}
