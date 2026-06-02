package task3;

/**
 * Class of two-dimensional vector with coordinates (X, Y)
 */
public class Vector2D {

    /**
     * The X coordinate field
     */
    private double x;

    /**
     * The Y coordinate field
     */
    private double y;

    /**
     * Constructor for creating a two-dimensional vector
     *
     * @param x the X coordinate
     * @param y the Y coordinate
     */
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method of getting the X coordinate
     *
     * @return the X coordinate
     */
    public double getX() {
        return x;
    }

    /**
     * Method for setting the X coordinate
     *
     * @param x the X coordinate
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Method of getting the Y coordinate
     *
     * @return the Y coordinate
     */
    public double getY() {
        return y;
    }

    /**
     * Method for setting the Y coordinate
     *
     * @param y the Y coordinate
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Returns a string representation of a vector in the format {x,y},
     * where x and y are the coordinates of the vector
     *
     * @return string representation of a vector
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "{" + x + "," + y + '}';
    }
}
