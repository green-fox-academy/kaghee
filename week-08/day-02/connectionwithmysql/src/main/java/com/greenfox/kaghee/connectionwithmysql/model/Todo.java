package com.greenfox.kaghee.connectionwithmysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    int id;
    String title;
    boolean urgent;
    boolean done;

    public boolean getUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Todo() {
    }

    public Todo(String title) {
        this.title = title;
    }

    public Todo(String title, boolean done, boolean urgent) {
        this.title = title;
        this.done = done;
        this.urgent = urgent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}

