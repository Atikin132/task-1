package task2.figures;

import task2.Figure;

public class Square extends Figure {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public int getPerimeter() {
        return side * 4;
    }

    @Override
    public String getName() {
        return "Square";
    }
}
