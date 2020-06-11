public class Rectangle extends Shape{

    public double length;
    public double width;
    public double area;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        area = length * width;
        return area;
    }
}
