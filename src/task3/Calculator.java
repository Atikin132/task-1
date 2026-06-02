package task3;

/**
 * An interface for performing basic arithmetic operations
 *
 * @param <T> is the data type on which operations are performed
 */
public interface Calculator<T> {
    /**
     * Adds two objects
     *
     * @param a first operand
     * @param b second operand
     * @return addition result
     */
    T sum(T a, T b);

    /**
     * Subtracts two objects
     *
     * @param a first operand
     * @param b second operand
     * @return subtraction result
     */
    T subtract(T a, T b);

    /**
     * Multiplies two objects
     *
     * @param a first operand
     * @param b second operand
     * @return multiplication result
     */
    T multiply(T a, T b);

    /**
     * Divides two objects
     *
     * @param a first operand
     * @param b second operand
     * @return division result
     */
    T divide(T a, T b);
}
