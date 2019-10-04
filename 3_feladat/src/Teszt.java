
public class Teszt {

    public static void main(String[] args) {
        Rectangle one = new Rectangle(4,40);
        Rectangle two = new Rectangle(3.5, 35.9);
        System.out.println(one.toString()+", "+one.getArea()+", "+one.getPerimeter());
        System.out.println(two.toString()+", "+two.getArea()+", "+two.getPerimeter());
    }
}
