package com.greenfox.kaghee.frontend.controllers;

public class ErrorHndlr {
    String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public ErrorHndlr(String error) {

        this.error = error;
    }
}
