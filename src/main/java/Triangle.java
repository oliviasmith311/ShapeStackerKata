public class Triangle extends Shape {

    public double lengthA;
    public double lengthB;
    public double area;

    public Triangle(double lengthA, double lengthB){
        this.lengthA = lengthA;
        this.lengthB = lengthB;
    }

    @Override
    public double getArea(){
        area = ((Math.sqrt((lengthB * lengthB) - ((lengthA * lengthA) / 4))) * lengthA) / 2;
        double result = Math.round(area*100)/100;
        return result;
    }
}
