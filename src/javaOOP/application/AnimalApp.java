package javaOOP.application;

import javaOOP.annotation.Fancy;
import javaOOP.data.Animal;
import javaOOP.data.Cat;

@Fancy(name = "AnimalApp", tags = {"Application", "Java"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Anabul";
        animal.run();
    }
}
