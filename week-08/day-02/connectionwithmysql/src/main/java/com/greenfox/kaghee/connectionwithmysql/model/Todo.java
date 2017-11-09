package com.greenfox.kaghee.connectionwithmysql.model;

import javax.persistence.*;
@Entity
public class Todo {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    long id;
    String title;
    boolean urgent;
    boolean done;

    @ManyToOne(fetch = FetchType.EAGER)
    Assignee person;

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

    public Assignee getPerson() {
        return person;
    }

    public void setPerson(Assignee person) {
        this.person = person;
    }

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}

