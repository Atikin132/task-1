package task3.calculator;

import task3.Calculator;
import task3.Vector2D;

/**
 * Implementation of mathematical operations for Vector2D
 *
 * @see Calculator
 */
public class Vector2DCalculator implements Calculator<Vector2D> {

    /**
     * Calculates the sum of two Vector2D by adding their respective coordinates
     *
     * @param a first Vector2D operand
     * @param b second Vector2D operand
     * @return a new Vector2D object representing the sum of vectors
     * @see Calculator#sum(Object, Object)
     */
    @Override
    public Vector2D sum(Vector2D a, Vector2D b) {
        return new Vector2D(a.getX() + b.getX(), a.getY() + b.getY());
    }

    /**
     * Calculates the difference between two Vector2D by component-by-component
     * subtraction of the corresponding coordinates of the second Vector2D from the first
     *
     * @param a first Vector2D operand
     * @param b second Vector2D operand
     * @return a new Vector2D object representing the difference of vectors
     * @see Calculator#subtract(Object, Object)
     */
    @Override
    public Vector2D subtract(Vector2D a, Vector2D b) {
        return new Vector2D(a.getX() - b.getX(), a.getY() - b.getY());
    }

    /**
     * Calculates the component-by-component multiplication of the corresponding
     * coordinates of two vectors
     *
     * @param a first Vector2D operand
     * @param b second Vector2D operand
     * @return a new Vector2D object representing vector multiplication
     * @see Calculator#multiply(Object, Object)
     */
    @Override
    public Vector2D multiply(Vector2D a, Vector2D b) {
        return new Vector2D(a.getX() * b.getX(), a.getY() * b.getY());
    }

    /**
     * Calculates the component-by-component division of the corresponding
     * coordinates of two vectors
     *
     * @param a first Vector2D operand
     * @param b second Vector2D operand
     * @return a new Vector2D object representing vector division
     * @see Calculator#divide(Object, Object)
     */
    @Override
    public Vector2D divide(Vector2D a, Vector2D b) {
        return new Vector2D(a.getX() / b.getX(), a.getY() / b.getY());
    }
}
