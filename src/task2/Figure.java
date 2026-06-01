package task2;

public abstract class Figure implements Printable {

    public abstract double getArea();

    public abstract int getPerimeter();

    public abstract String getName();

    @Override
    public void print() {
        System.out.printf("This figure is a %s with a perimeter of %d\n", getName(), getPerimeter());
    }

    public void printArea() {
        System.out.println("Area of " + getName() + " is " + getArea());
    }
}
