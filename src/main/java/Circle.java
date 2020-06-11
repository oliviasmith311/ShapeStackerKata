public class Circle extends Shape {

    public double diameter;
    public double area;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public double getArea(){
        area = Math.PI * (diameter/2) * (diameter/2);
        double result = Math.round(area*100)/100;
        return result;
    }
}
