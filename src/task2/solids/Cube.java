package task2.solids;

import task2.Solid;

public class Cube extends Solid {

    private int side;

    public Cube(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public String getName() {
        return "Cube";
    }
}
