package com.pch777.jop.module7.model;

public class Thing {

    public String name;
    public String colour;

    public Thing() {

    }
    public Thing(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String printInheritanceHierarchy() {
        String className = Thing.class.getSimpleName();
        return "[" + className +"]";
    }

    public String printInformationAboutTheThing() {
        return "[Name: " + name +"]" + " [Colour: " + colour + "]";
    }

}
