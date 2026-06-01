package task2;

public abstract class Solid implements Printable {

    public abstract double getVolume();

    public abstract String getName();

    @Override
    public void print() {
        System.out.printf("This solid is a %s with a volume of %f\n", getName(), getVolume());
    }
}
