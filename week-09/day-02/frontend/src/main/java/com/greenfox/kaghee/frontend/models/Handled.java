package com.greenfox.kaghee.frontend.models;

public class Handled {
    String result;

    public Handled(String operation, int[] numbers) {
        //sum, multipy, double
        if (operation.equals("sum")) {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            result = String.valueOf(sum);
        } else if (operation.equals("multiply")) {
            int multiple = 1;
            for (int i = 0; i < numbers.length; i++) {
                multiple *= numbers[i];
            }
            result = String.valueOf(multiple);
        } else if (operation.equals("double")) {
            int[] doubles = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                doubles[i] = numbers[i] * 2;
            }
            result = doubles.toString();
        }
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
