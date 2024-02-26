package com.pch777.jop.module7;

import com.pch777.jop.module7.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Homework7Test {

    @Test
    void shouldReturnInformationAboutObjectOfThingClass() {
        //given
        Thing thing = new Thing("Car", "Red");
        //when
        String information = thing.printInformationAboutTheThing();
        //then
        assertEquals("[Name: Car] [Colour: Red]", information);

    }

    @Test
    void shouldReturnInformationAboutHierarchyOfThingClass() {
        //given
        Thing thing = new Thing("Car", "Red");
        //when
        String hierarchy = thing.printInheritanceHierarchy();
        //then
        assertEquals("[Thing]", hierarchy);

    }

    @Test
    void shouldReturnInformationAboutObjectOfLivingThing() {
        //given
        LivingThing livingThing = new LivingThing("Spider", "Colourful", 2);
        //when
        String information = livingThing.printInformationAboutTheThing();
        //then
        assertEquals("[Name: Spider] [Colour: Colourful] [Age: 2]", information);

    }

    @Test
    void shouldReturnInformationAboutHierarchyOfLivingThing() {
        //given
        LivingThing livingThing = new LivingThing();
        //when
        String hierarchy = livingThing.printInheritanceHierarchy();
        //then
        assertEquals("[LivingThing] <- [Thing]", hierarchy);

    }

    @Test
    void shouldReturnInformationAboutObjectOfNonLivingThing() {
        //given
        NonLivingThing nonLivingThing = new NonLivingThing("Bucket", "Yellow", "Plastic");
        //when
        String information = nonLivingThing.printInformationAboutTheThing();
        //then
        assertEquals("[Name: Bucket] [Colour: Yellow] [Material: Plastic]", information);

    }

    @Test
    void shouldReturnInformationAboutHierarchyOfNonLivingThing() {
        //given
        NonLivingThing nonLivingThing = new NonLivingThing();
        //when
        String hierarchy = nonLivingThing.printInheritanceHierarchy();
        //then
        assertEquals("[NonLivingThing] <- [Thing]", hierarchy);

    }

    @Test
    void shouldReturnInformationAboutObjectOfAnimal() {
        //given
        Animal animal = new Animal("Bull", "Brown", 4, "Cattle");
        //when
        String information = animal.printInformationAboutTheThing();
        //then
        assertEquals("[Name: Bull] [Colour: Brown] [Age: 4] [Species: Cattle]", information);

    }

    @Test
    void shouldReturnInformationAboutHierarchyOfAnimal() {
        //given
        Animal animal = new Animal();
        //when
        String hierarchy = animal.printInheritanceHierarchy();
        //then
        assertEquals("[Animal] <- [LivingThing] <- [Thing]", hierarchy);

    }

    @Test
    void shouldReturnInformationAboutObjectOfPlant() {
        //given
        Plant plant = new Plant("Pear", "Yellow", 7, true);
        //when
        String information = plant.printInformationAboutTheThing();
        //then
        assertEquals("[Name: Pear] [Colour: Yellow] [Age: 7] [hasFruits: true]", information);

    }

    @Test
    void shouldReturnInformationAboutHierarchyOfPlant() {
        //given
        Plant plant = new Plant();
        //when
        String hierarchy = plant.printInheritanceHierarchy();
        //then
        assertEquals("[Plant] <- [LivingThing] <- [Thing]", hierarchy);

    }

    @Test
    void shouldReturnInformationAboutObjectOfRock() {
        //given
        Rock rock = new Rock("Rubin", "Red", "Ruby", "small");
        //when
        String information = rock.printInformationAboutTheThing();
        //then
        assertEquals("[Name: Rubin] [Colour: Red] [Material: Ruby] [Size: small]", information);

    }

    @Test
    void shouldReturnInformationAboutHierarchyOfRock() {
        //given
        Rock rock = new Rock();
        //when
        String hierarchy = rock.printInheritanceHierarchy();
        //then
        assertEquals("[Rock] <- [NonLivingThing] <- [Thing]", hierarchy);

    }

    @Test
    void shouldReturnInformationAboutObjectOfAir() {
        //given
        Air air = new Air("Air", "transparent", "gas", "smog");
        //when
        String information = air.printInformationAboutTheThing();
        //then
        assertEquals("[Name: Air] [Colour: transparent] [Material: gas] [Quality: smog]", information);

    }

    @Test
    void shouldReturnInformationAboutHierarchyOfAir() {
        //given
        Air air = new Air();
        //when
        String hierarchy = air.printInheritanceHierarchy();
        //then
        assertEquals("[Air] <- [NonLivingThing] <- [Thing]", hierarchy);

    }

    @Test
    void shouldReturnInformationAboutObjectOfBird() {
        //given
        Bird bird = new Bird("Pingu", "White-Black", 3, "Penguins", false);
        //when
        String information = bird.printInformationAboutTheThing();
        //then
        assertEquals("[Name: Pingu] [Colour: White-Black] [Age: 3] [Species: Penguins] [Can fly: false]", information);

    }

    @Test
    void shouldReturnInformationAboutHierarchyOfBird() {
        //given
        Bird bird = new Bird();
        //when
        String hierarchy = bird.printInheritanceHierarchy();
        //then
        assertEquals("[Bird] <- [Animal] <- [LivingThing] <- [Thing]", hierarchy);

    }

    @Test
    void shouldReturnInformationAboutObjectOfReptail() {
        //given
        Reptail reptail = new Reptail("Wally", "Brown", 5, "Crocodiles");
        //when
        String information = reptail.printInformationAboutTheThing();
        //then
        assertEquals("[Name: Wally] [Colour: Brown] [Age: 5] [Species: Crocodiles]", information);

    }

    @Test
    void shouldReturnInformationAboutHierarchyOfReptail() {
        //given
        Reptail reptail = new Reptail();
        //when
        String hierarchy = reptail.printInheritanceHierarchy();
        //then
        assertEquals("[Reptail] <- [Animal] <- [LivingThing] <- [Thing]", hierarchy);

    }

    @Test
    void shouldReturnInformationAboutObjectOfMammal() {
        //given
        Mammal mammal = new Mammal("King kong", "Black", 10, "Apes", false);
        //when
        String information = mammal.printInformationAboutTheThing();
        //then
        assertEquals("[Name: King kong] [Colour: Black] [Age: 10] [Species: Apes] [Has tail: false]", information);

    }

    @Test
    void shouldReturnInformationAboutHierarchyOfMammal() {
        //given
        Mammal mammal = new Mammal();
        //when
        String hierarchy = mammal.printInheritanceHierarchy();
        //then
        assertEquals("[Mammal] <- [Animal] <- [LivingThing] <- [Thing]", hierarchy);

    }

    @Test
    void shouldReturnInformationAboutObjectOfDog() {
        //given
        Dog dog = new Dog("Pluto", "Yellow-Orange", 8, "Mixed-breed", true, true);
        //when
        String information = dog.printInformationAboutTheThing();
        //then
        assertEquals("[Name: Pluto] [Colour: Yellow-Orange] [Age: 8] [Species: Mixed-breed] [Has tail: true] [Is trained: true]", information);

    }

    @Test
    void shouldReturnInformationAboutHierarchyOfDog() {
        //given
        Dog dog = new Dog();
        //when
        String hierarchy = dog.printInheritanceHierarchy();
        //then
        assertEquals("[Dog] <- [Mammal] <- [Animal] <- [LivingThing] <- [Thing]", hierarchy);

    }

    @Test
    void shouldReturnInformationAboutObjectOfCat() {
        //given
        Cat cat = new Cat("Garfield", "Orange", 5, "Persian", true, true);
        //when
        String information = cat.printInformationAboutTheThing();
        //then
        assertEquals("[Name: Garfield] [Colour: Orange] [Age: 5] [Species: Persian] [Has tail: true] [Is domestic: true]", information);

    }

    @Test
    void shouldReturnInformationAboutHierarchyOfCat() {
        //given
        Cat cat = new Cat();
        //when
        String hierarchy = cat.printInheritanceHierarchy();
        //then
        assertEquals("[Cat] <- [Mammal] <- [Animal] <- [LivingThing] <- [Thing]", hierarchy);

    }

    @Test
    void shouldReturnCatSound() {
        //given
        Cat cat = new Cat("Garfield", "Orange", 5, "Persian", true, true);
        //when
        String sound = cat.makeSound("Meow");
        //then
        assertEquals("[Sound: Meow]", sound);

    }



}