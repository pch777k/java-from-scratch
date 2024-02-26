package com.pch777.jop.module7.model;

public class Bird extends Animal {

    public boolean canFly;

    public Bird() {}

    public Bird(String name, String colour, int age, String species, boolean canFly) {
        super(name, colour, age, species);
        this.canFly = canFly;
    }


    public String printInheritanceHierarchy() {
        String className = Bird.class.getSimpleName();
        return "[" + className + "] <- " + super.printInheritanceHierarchy();
    }

    public String printInformationAboutTheThing() {
        return super.printInformationAboutTheThing() + " [Can fly: " + canFly +"]";
    }
}
