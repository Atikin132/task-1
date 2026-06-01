package task2;

import task2.figures.Square;
import task2.figures.Trapeze;
import task2.figures.Triangle;
import task2.solids.Cone;
import task2.solids.Cube;
import task2.solids.Cylinder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Figure> figureArrayList = new ArrayList<>();
        figureArrayList.add(new Triangle(2, 4, 3));
        figureArrayList.add(new Square(5));
        figureArrayList.add(new Trapeze(5, 10, 5, 4, 6));

        for (Figure figure : figureArrayList) {
            figure.print();
            figure.printArea();
        }

        ArrayList<Solid> solidArrayList = new ArrayList<>();
        solidArrayList.add(new Cube(5));
        solidArrayList.add(new Cylinder(5, 10));
        solidArrayList.add(new Cone(5, 10));

        for (Solid solid : solidArrayList) {
            solid.print();
        }
    }
}
