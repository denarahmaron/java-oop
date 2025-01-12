package javaOOP.application;

import javaOOP.data.Animal;
import javaOOP.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Anabul";
        animal.run();
    }
}
