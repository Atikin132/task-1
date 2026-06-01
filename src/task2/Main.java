package task2;

import task2.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(2, 4, 3);
        System.out.println(triangle1.getArea());
        triangle1.print();
    }
}
