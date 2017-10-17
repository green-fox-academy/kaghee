package main.java.animals;

public abstract class Animal {
    String name;
    public String coveredby;

    public abstract String move();
    public abstract String eat();


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
