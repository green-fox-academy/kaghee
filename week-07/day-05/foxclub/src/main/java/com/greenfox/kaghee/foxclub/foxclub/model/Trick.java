package com.greenfox.kaghee.foxclub.foxclub.model;

public class Trick {
    public void setDescription(String description) {
        this.description = description;
    }

    String description;

    public Trick(){

    }

    public Trick(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
