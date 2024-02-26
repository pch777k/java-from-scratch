package com.pch777.jop.module7;

import com.pch777.jop.module7.model.Air;
import com.pch777.jop.module7.model.Dog;

public class Homework7 {

    public static void main(String[] args) {

        Air air = new Air("Air", "transparent", "gas", "smog");
        System.out.println(air.printInformationAboutTheThing());
        System.out.println(air.printInheritanceHierarchy());

        System.out.println("---------------");

        Dog dog = new Dog("Pluto", "Yellow-Orange", 8, "Mixed-breed", true, true);
        System.out.println(dog.printInformationAboutTheThing());
        System.out.println(dog.printInheritanceHierarchy());
        System.out.println(dog.makeSound("Woof"));

    }
}
