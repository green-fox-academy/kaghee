package com.greenfox.kaghee.connectionwithmysql.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Assignee {
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

    @Id
    String name;
    String email;
}
