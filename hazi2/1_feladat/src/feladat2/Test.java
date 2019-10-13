package feladat2;

public class Test {

    public static void main(String[] args) {
        Triangle objektum = new Triangle(1, 1.5, 1);
        objektum.setColor("yellow");
        objektum.setFilled(true);
        System.out.println(objektum.getArea() + " " + objektum.getPerimeter() + " " + objektum.getColor() + " " + objektum.isFilled());
    }
}
