package com.pch777;

public class Plant extends LivingThing {

    public boolean hasFruits;

    public Plant(){}

    public Plant(String name, String colour, int age, boolean hasFruits) {
        super(name, colour, age);
        this.hasFruits = hasFruits;
    }

    public String printInheritanceHierarchy() {
        String className = Plant.class.getSimpleName();
        return "[" + className + "] <- " + super.printInheritanceHierarchy();
    }

    public String printInformationAboutTheThing() {
        return super.printInformationAboutTheThing() + " [hasFruits: " + hasFruits +"]";
    }
}
