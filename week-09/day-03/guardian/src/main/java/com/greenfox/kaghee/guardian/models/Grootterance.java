package com.greenfox.kaghee.guardian.models;

public class Grootterance {
    String received;
    String translated;

    public Grootterance(String received) {
        this.received = received;
        translated = "I am Groot!";
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }
}
