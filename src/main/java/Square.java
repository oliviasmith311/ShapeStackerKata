public class Square extends Shape {

    public double length;
    public double area;

    public Square(double length){
        this.length = length;
    }

    @Override
    public double getArea(){
        area = length * length;
        return area;
    }
}
