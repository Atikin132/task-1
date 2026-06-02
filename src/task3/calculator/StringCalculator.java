package task3.calculator;

import task3.Calculator;

/**
 * Implementation of mathematical operations for String
 *
 * @see Calculator
 */
public class StringCalculator implements Calculator<String> {

    /**
     * Concatenates two String objects
     *
     * @param a first String operand
     * @param b second String operand
     * @return the concatenated string containing a and b
     * @see Calculator#sum(Object, Object)
     */
    @Override
    public String sum(String a, String b) {
        return a + b;
    }

    /**
     * Deletes the first occurrence of string b from string a
     *
     * @param a first String operand
     * @param b second String operand
     * @return string a without a single occurrence of string b
     * @see Calculator#subtract(Object, Object)
     */
    @Override
    public String subtract(String a, String b) {
        return a.replaceFirst(b, "");
    }

    /**
     * Performs character-by-character multiplication of two strings
     *
     * @param a first String operand
     * @param b second String operand
     * @return a string consisting of all possible combinations of character pairs
     * @see Calculator#multiply(Object, Object)
     */
    @Override
    public String multiply(String a, String b) {
        StringBuilder res = new StringBuilder();
        for (String first : a.split("")) {
            for (String second : b.split("")) {
                res.append(first).append(second);
            }
        }
        return res.toString();
    }

    /**
     * Deletes all occurrences of string b from string a
     *
     * @param a first String operand
     * @param b second String operand
     * @return string a without all occurrence of string b
     * @see Calculator#divide(Object, Object)
     */
    @Override
    public String divide(String a, String b) {
        return a.replace(b, "");
    }
}
