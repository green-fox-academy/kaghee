package com.greenfox.kaghee.frontend.models;

public class Calculation {
    int result = 0;

    public Calculation(String operation, int until) {
        if (operation.equals("sum")) {
            for (int i = 0; i < until + 1; i++) {
                this.result += i;
            }
        } else if (operation.equals("factor")) {
            result++;
            for (int i = 1; i < until + 1; i++) {
                this.result *= i;
            }
        }
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
