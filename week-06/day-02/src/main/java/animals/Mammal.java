package main.java.animals;

public class Mammal extends Animal {

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String eat() {
        return "plants or other animals";
    }

    public Mammal(String name) {
        super(name);
        coveredby = "fur";
    }


}
