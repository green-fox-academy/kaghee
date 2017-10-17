package main.java.animals;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
        coveredby = "feathers";
    }

    @Override
    public String move() {
        return "fly";
    }

    @Override
    public String eat() {
        return "fish, insects or seeds";
    }
}
