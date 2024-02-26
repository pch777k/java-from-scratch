package com.pch777.jop.module7.model;

public class Air extends NonLivingThing {

    public String quality;

    public Air() {}

    public Air(String name, String colour, String material, String quality) {
        super(name, colour, material);
        this.quality = quality;
    }

    public String printInheritanceHierarchy() {
        String className = Air.class.getSimpleName();
        return "[" + className + "] <- " + super.printInheritanceHierarchy();
    }

    public String printInformationAboutTheThing() {
        return super.printInformationAboutTheThing() + " [Quality: " + quality +"]";
    }
}
