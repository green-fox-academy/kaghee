package com.greenfox.kaghee.frontend.models;

public class AppendedWord {
    String appended;

    public AppendedWord(String word) {
        this.appended = word + "a";
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
