package com.company;

public class Animals {
    public static void main(String[] args) {
        WildAnimals lion= new WildAnimals(16, true, "ginger");
        Pets dogs = new Pets();
        System.out.println(lion.age + " " + lion.predator + " " + lion.color) ;
        System.out.println(dogs.age);
        System.out.println(dogs.breed);
    }
}
