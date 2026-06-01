package task2;

import task2.figures.Square;
import task2.figures.Trapeze;
import task2.figures.Triangle;
import task2.solids.Cone;
import task2.solids.Cube;
import task2.solids.Cylinder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Figure> figures = new ArrayList<>();
        figures.add(new Triangle(2, 4, 3));
        figures.add(new Square(5));
        figures.add(new Trapeze(5, 10, 5, 4, 6));

        for (Figure figure : figures) {
            figure.print();
            figure.printArea();
        }

        List<Solid> solids = new ArrayList<>();
        solids.add(new Cube(5));
        solids.add(new Cylinder(5, 10));
        solids.add(new Cone(5, 10));

        for (Solid solid : solids) {
            solid.print();
        }
    }
}
