package com.pch777.jop.module7.model;

public class Mammal extends Animal {

    public boolean hasTail;

    public Mammal(){};

    public Mammal(String name, String colour, int age, String species, boolean hasTail) {
        super(name, colour, age, species);
        this.hasTail = hasTail;
    }


    public String printInheritanceHierarchy() {
        String className = Mammal.class.getSimpleName();
        return "[" + className + "] <- " + super.printInheritanceHierarchy();
    }

    public String printInformationAboutTheThing() {
        return super.printInformationAboutTheThing() + " [Has tail: " + hasTail +"]";
    }

    public String makeSound(String sound) {
        return "[Sound: " + sound + "]";
    }
}
