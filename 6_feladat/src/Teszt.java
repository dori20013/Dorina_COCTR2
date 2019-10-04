
public class Teszt {

    public static void main(String[] args) {
        LinearEquation a1 = new LinearEquation(4, 5, 53, 6, 2, 65);
        LinearEquation a2 = new LinearEquation(2, 67, 43, 3, 5, 2);
        LinearEquation a3 = new LinearEquation(5, 5, 5, 5, 7, 2);

        if (!a1.isSolvable()) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.println(a1.getX()+"  "+a1.getY());   
        }
        if (!a2.isSolvable()) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.println(a2.getX()+"  "+a2.getY());   
        }
        if (!a3.isSolvable()) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.println(a3.getX()+"  "+a3.getY());   
        }
    }

}
