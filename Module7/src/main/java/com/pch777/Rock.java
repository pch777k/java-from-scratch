package com.pch777;

public class Rock extends NonLivingThing {

    public String size;

    public Rock() {}

    public Rock(String name, String colour, String material, String size) {
        super(name, colour, material);
        this.size = size;
    }

    public String printInheritanceHierarchy() {
        String className = Rock.class.getSimpleName();
        return "[" + className + "] <- " + super.printInheritanceHierarchy();
    }

    public String printInformationAboutTheThing() {
        return super.printInformationAboutTheThing() + " [Size: " + size + "]";
    }
}
