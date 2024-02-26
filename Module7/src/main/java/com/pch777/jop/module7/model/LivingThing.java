package com.pch777.jop.module7.model;

public class LivingThing extends Thing {

    public int age;

    public LivingThing() {}

    public LivingThing(String name, String colour) {
        super(name, colour);
    }

    public LivingThing(String name, String colour, int age) {
        this(name, colour);
        this.age = age;
    }

    public String printInheritanceHierarchy() {
        String className = LivingThing.class.getSimpleName();
        return "[" + className + "] <- " + super.printInheritanceHierarchy();
    }

    public String printInformationAboutTheThing() {
        return super.printInformationAboutTheThing() + " [Age: " + age + "]";
    }
}
