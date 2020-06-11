import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShapeStackerTest {

    private Triangle testTriangle;
    private Circle testCircle;
    private Rectangle testRectangle;
    private Square testSquare;

    @BeforeEach
    void setUp() {
        testTriangle = new Triangle(3, 4);
        testCircle = new Circle(8);
        testRectangle = new Rectangle(4, 5);
        testSquare = new Square(4);
    }

    @Test
    public void shouldFindAreaOfSquare(){
        int result = testSquare.getArea();
        assertThat(result).isEqualTo(16);
    }

    @Test
    public void shouldFindAreaOfRectangle(){
        int result = testRectangle.getArea();
        assertThat(result).isEqualTo(20);
    }

    @Test
    public void shouldFindAreaOfCircle(){
        double result = testCircle.getArea();
        assertThat(result).isEqualTo(50.0);
    }

    @Test
    public void shouldFindAreaOfTriangle(){
        double result = testTriangle.getArea();
        assertThat(result).isEqualTo(5.0);
    }

    @Test
    public void shouldFindBiggerShapeBetweenTwo(){
        assertThat(testCircle.getArea()).isGreaterThan(testTriangle.getArea());
    }

}
