package task2.solids;

import task2.Solid;

public class Cylinder extends Solid {

    private int radius;
    private int height;

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String getName() {
        return "Cylinder";
    }
}
