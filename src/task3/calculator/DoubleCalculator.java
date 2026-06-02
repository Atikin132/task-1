package task3.calculator;

import task3.Calculator;

/**
 * Implementation of mathematical operations for Double
 *
 * @see Calculator
 */
public class DoubleCalculator implements Calculator<Double> {

    /**
     * Adds two Double objects
     *
     * @param a first Double operand
     * @param b second Double operand
     * @return the result of adding two Double objects
     * @see Calculator#sum(Object, Object)
     */
    @Override
    public Double sum(Double a, Double b) {
        return a + b;
    }

    /**
     * Subtracts two Double objects
     *
     * @param a first Double operand
     * @param b second Double operand
     * @return the result of subtracting two Double objects
     * @see Calculator#subtract(Object, Object)
     */
    @Override
    public Double subtract(Double a, Double b) {
        return a - b;
    }


    /**
     * Multiplies two Double objects
     *
     * @param a first Double operand
     * @param b second Double operand
     * @return the result of multiplying two Double objects
     * @see Calculator#multiply(Object, Object)
     */
    @Override
    public Double multiply(Double a, Double b) {
        return a * b;
    }

    /**
     * Divides two Double objects
     *
     * @param a first Double operand
     * @param b second Double operand
     * @return the result of dividing two Double objects
     * @see Calculator#divide(Object, Object)
     */
    @Override
    public Double divide(Double a, Double b) {
        return a / b;
    }
}
