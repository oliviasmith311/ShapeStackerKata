public class ShapeStackerApp {


    public Shape largest;
    public Shape middle;
    public Shape smallest;
    public static Circle circle;
    public static Rectangle rectangle;
    public static Square square;
    public static Triangle triangle;

    public static void main(String[] args) {
        circle = new Circle(4);
        square = new Square(4);
        triangle = new Triangle(4, 10);
    }

    public String findSizes(Shape shape1, Shape shape2, Shape shape3){
        double size1 = shape1.getArea();
        double size2 = shape2.getArea();
        double size3 = shape3.getArea();

        if(size1 > size2 && size1 > size3){
            largest = shape1;
            if(size2 > size3){
                middle = shape2;
                smallest = shape3;
            } else {
                middle = shape3;
                smallest = shape2;
            }
        }
        else if(size1 > size2 && size1 < size3){
            middle = shape1;
            smallest = shape2;
            largest = shape3;
        }
        else if(size1 < size2 && size1 > size3){
            middle = shape1;
            smallest = shape3;
            largest = shape2;
        }
        else if(size1 < size2 && size1 < size3){
            smallest = shape1;
            if(size2 > size3){
                largest = shape2;
                middle = shape3;
            } else {
                largest = shape3;
                middle = shape2;
            }
        }

        String result = "[" + largest + "[" + middle + "[" + smallest + "]]]";
        return result;
    }
}
