package task2;

import task2.figures.Square;
import task2.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(2, 4, 3);
        System.out.println(triangle1.getArea());
        triangle1.print();
        Square square = new Square(5);
        System.out.println("Area of " + square.getName() + " is " + square.getArea());
        square.print();
    }
}
