package homework_32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {

    private ShapeCalculator shapeCalculator = new ShapeCalculator();

    @Test
    public void oneShape_test() {
        Shape[] shapes = {new Rectangle(5,10)};

        assertEquals(15,shapeCalculator.totalSquare(shapes));
    }

    @Test
    public void twoShape_test() {
        Shape[] shapes = {new Rectangle(5,10), new Circle(10)};

        assertEquals(329,shapeCalculator.totalSquare(shapes));
    }

}