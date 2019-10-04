
public class Teszt {

    public static void main(String[] args) {
        RegularPolygon egy = new RegularPolygon();
        RegularPolygon ketto = new RegularPolygon(6, 4);
        RegularPolygon harom = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println(egy.getPerimeter());
        System.out.println(ketto.getPerimeter());
        System.out.println(harom.getPerimeter());
        System.out.println(egy.getArea());
        System.out.println(ketto.getArea());
        System.out.println(harom.getArea());
                
    }
}
