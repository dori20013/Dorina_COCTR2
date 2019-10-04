
public class Test {

    public static void main(String[] args) {
        QuadraticEquation obj1 = new QuadraticEquation(5, 3, 7);
        QuadraticEquation obj2 = new QuadraticEquation(-5, 4, 2);
        QuadraticEquation obj3 = new QuadraticEquation(5, -3, 7);

        if (obj1.getDiscriminant() > 0) {
            System.out.println(obj1.getRoot1() + "    " + obj1.getRoot2());
        } else if (obj1.getDiscriminant() == 0) {
            System.out.println(obj1.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }

        if (obj2.getDiscriminant() > 0) {
            System.out.println(obj2.getRoot1() + "    " + obj2.getRoot2());
        } else if (obj1.getDiscriminant() == 0) {
            System.out.println(obj2.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }

        if (obj3.getDiscriminant() > 0) {
            System.out.println(obj3.getRoot1() + "    " + obj3.getRoot2());
        } else if (obj1.getDiscriminant() == 0) {
            System.out.println(obj3.toString());
        } else {
            System.out.println("The equation has no roots.");
        }

    }
}
