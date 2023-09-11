package homework_32;

/*
Создать интерфейс Shape,содержащиq методы для подсчета площади и периметра фигуры и классы прямоугольник и круг,
реализующие этот интерфейс.
В методе main создать несколько фигур и вывести на печать площадь и периметр каждой.
Написать метод, вычисляющий общую площадь фигур нескольких видов, т.е. если площадь прямоугольника = 100,
круга = 50, то общая площадь 150
 */
public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(10);
        System.out.println("Perimetr: " + circle.perimeter());
        System.out.println("Area: " + circle.area());

        Shape rectangle = new Rectangle(10,10);
        System.out.println("Perimetr: " + rectangle.perimeter());
        System.out.println("Area: " + rectangle.area());

        Shape[] shapes = {circle,rectangle};  // masivv

        ShapeCalculator shapeCalculator = new ShapeCalculator();  // vsyo v meste
        System.out.println(shapeCalculator.totalSquare(shapes));
    }
}
