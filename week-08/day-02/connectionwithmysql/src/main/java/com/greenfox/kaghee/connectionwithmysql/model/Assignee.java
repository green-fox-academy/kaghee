package com.greenfox.kaghee.connectionwithmysql.model;

import javax.persistence.*;

@Entity
public class Assignee {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    long id;
    String name;
    String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Assignee() {

    }
}
