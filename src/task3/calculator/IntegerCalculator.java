package task3.calculator;

import task3.Calculator;

/**
 * Implementation of mathematical operations for Integer
 *
 * @see Calculator
 */
public class IntegerCalculator implements Calculator<Integer> {

    /**
     * Adds two Integer objects
     *
     * @param a first Integer operand
     * @param b second Integer operand
     * @return the result of adding two Integer objects
     * @see Calculator#sum(Object, Object)
     */
    @Override
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }

    /**
     * Subtracts two Integer objects
     *
     * @param a first Integer operand
     * @param b second Integer operand
     * @return the result of subtracting two Integer objects
     * @see Calculator#subtract(Object, Object)
     */
    @Override
    public Integer subtract(Integer a, Integer b) {
        return a - b;
    }

    /**
     * Multiplies two Integer objects
     *
     * @param a first Integer operand
     * @param b second Integer operand
     * @return the result of multiplying two Integer objects
     * @see Calculator#multiply(Object, Object)
     */
    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    /**
     * Divides two Integer objects
     *
     * @param a first Integer operand
     * @param b second Integer operand
     * @return the result of dividing two Integer objects
     * @throws ArithmeticException if the divisor(b) is zero
     * @see Calculator#divide(Object, Object)
     */
    @Override
    public Integer divide(Integer a, Integer b) {
        return a / b;
    }
}
