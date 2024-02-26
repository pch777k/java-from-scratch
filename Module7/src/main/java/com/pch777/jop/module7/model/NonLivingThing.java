package com.pch777.jop.module7.model;

public class NonLivingThing extends Thing {

    public String material;

    public NonLivingThing() {}

    public NonLivingThing(String name, String colour) {
        super(name, colour);
    }

    public NonLivingThing(String name, String colour, String material) {
        this(name, colour);
        this.material = material;
    }

    public String printInheritanceHierarchy() {
        String className = NonLivingThing.class.getSimpleName();
        return "[" + className + "] <- " + super.printInheritanceHierarchy();
    }

    public String printInformationAboutTheThing() {
        return super.printInformationAboutTheThing() + " [Material: " + material + "]";
    }
}
