package task2;

import task2.figures.Square;
import task2.figures.Trapeze;
import task2.figures.Triangle;
import task2.solids.Cone;
import task2.solids.Cube;
import task2.solids.Cylinder;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 4, 3);
        triangle.print();
        System.out.println("Area of " + triangle.getName() + " is " + triangle.getArea());


        Square square = new Square(5);
        square.print();
        System.out.println("Area of " + square.getName() + " is " + square.getArea());


        Trapeze trapeze = new Trapeze(5, 10, 5, 4, 6);
        trapeze.print();
        System.out.println("Area of " + trapeze.getName() + " is " + trapeze.getArea());


        Cube cube = new Cube(5);
        cube.print();


        Cylinder cylinder = new Cylinder(5, 10);
        cylinder.print();


        Cone cone = new Cone(5, 10);
        cone.print();
    }
}
