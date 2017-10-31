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
    boolean isUrgent;
    boolean isDone;

    public Todo() {
    }

    public Todo(String title) {
        this.title = title;
    }

    public Todo(String title, boolean isDone, boolean isUrgent) {
        this.title = title;
        this.isDone = isDone;
        this.isUrgent = isUrgent;
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

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        this.isUrgent = urgent;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        this.isDone = done;
    }
}

