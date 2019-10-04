public class Rectangle {
    double width;
    double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }
    public double getPerimeter() {
        return (width+height)*2;
    }
    @Override
    public String toString(){
        return width+", "+height;//%.2f;
    }
}
