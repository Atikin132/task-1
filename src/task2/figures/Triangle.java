package task2.figures;

import task2.Figure;

public class Triangle extends Figure {

    private int sideA;
    private int sideB;
    private int sideC;


    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        double semiperimeter = getPerimeter() / 2f;
        return Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC));
    }

    @Override
    public int getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

}
