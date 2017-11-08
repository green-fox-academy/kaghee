package com.greenfox.kaghee.guardian.models;

public class ErrorResponse {
    String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public ErrorResponse(String error) {

        this.error = error;
    }
}
