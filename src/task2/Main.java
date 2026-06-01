package task2;

import task2.figures.Square;
import task2.figures.Trapeze;
import task2.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 4, 3);
        triangle.print();
        System.out.println("Area of " + triangle.getName() + " is " + triangle.getArea());


        Square square = new Square(5);
        square.print();
        System.out.println("Area of " + square.getName() + " is " + square.getArea());


        Trapeze trapeze = new Trapeze(5,10,5,4,6);
        trapeze.print();
        System.out.println("Area of " + trapeze.getName() + " is " + trapeze.getArea());
    }
}
