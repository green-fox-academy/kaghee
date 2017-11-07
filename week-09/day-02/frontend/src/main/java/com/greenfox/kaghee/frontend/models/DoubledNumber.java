package com.greenfox.kaghee.frontend.models;

public class DoubledNumber {
    int received;
    int result;
    String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public DoubledNumber(int received) {
        this.received = received;
        this.result = received * 2;
    }

    public int getReceived() {

        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
