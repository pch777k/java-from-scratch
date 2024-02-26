package com.pch777.jop.module7.model;

public class Animal extends LivingThing {

    public String species;

    public Animal(){}

    public Animal(String name, String colour, int age, String species) {
        super(name, colour, age);
        this.species = species;
    }

    public String printInheritanceHierarchy() {
        String className = Animal.class.getSimpleName();
        return "[" + className + "] <- " + super.printInheritanceHierarchy();
    }

    public String printInformationAboutTheThing() {
        return super.printInformationAboutTheThing() + " [Species: " + species +"]";
    }


}
