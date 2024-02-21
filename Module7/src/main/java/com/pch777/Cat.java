package com.pch777;

public class Cat extends Mammal {

    public boolean isDomestic;

    public Cat(){};

    public Cat(String name, String colour, int age, String species, boolean hasTail, boolean isDomestic) {
        super(name, colour, age, species, hasTail);
        this.isDomestic = isDomestic;
    }

    public String printInheritanceHierarchy() {
        String className = Cat.class.getSimpleName();
        return "[" + className + "] <- " + super.printInheritanceHierarchy();
    }

    public String printInformationAboutTheThing() {
        return super.printInformationAboutTheThing() + " [Is domestic: " + isDomestic +"]";
    }
}
