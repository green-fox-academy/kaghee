package main.java.animals;

public class Reptile extends Animal {
    public Reptile(String name) {
        super(name);
        coveredby = "scales";
    }

    @Override
    public String move() {
        return "slither";
    }

    @Override
    public String eat() {
        return "eggs of other reptiles";
    }
}
