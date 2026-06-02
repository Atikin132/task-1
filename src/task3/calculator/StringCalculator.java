package task3.calculator;

import task3.Calculator;

public class StringCalculator implements Calculator<String> {
    @Override
    public String sum(String a, String b) {
        return a + b;
    }

    @Override
    public String subtract(String a, String b) {
        return a.replaceFirst(b, "");
    }

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

    @Override
    public String divide(String a, String b) {
        return a.replace(b, "");
    }
}
