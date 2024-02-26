package com.pch777.jop.module7.model;

public class Dog extends Mammal {

    public boolean isTrained;

    public Dog(){};

    public Dog(String name, String colour, int age, String species, boolean hasTail, boolean isTrained) {
        super(name, colour, age, species, hasTail);
        this.isTrained = isTrained;
    }

    public String printInheritanceHierarchy() {
        String className = Dog.class.getSimpleName();
        return "[" + className + "] <- " + super.printInheritanceHierarchy();
    }

    public String printInformationAboutTheThing() {
        return super.printInformationAboutTheThing() + " [Is trained: " + isTrained +"]";
    }

}
