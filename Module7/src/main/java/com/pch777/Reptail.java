package com.pch777;

public class Reptail extends Animal {

    public Reptail(){};

    public Reptail(String name, String colour, int age, String species) {
       super(name, colour, age, species);
    }

    public String printInheritanceHierarchy() {
        String className = Reptail.class.getSimpleName();
        return "[" + className + "] <- " + super.printInheritanceHierarchy();
    }

}
