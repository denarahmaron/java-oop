package javaOOP.application;

import javaOOP.data.Avanza;

public class CarApp {
    public static void main(String[] args) {
        var car = new Avanza();
        car.drive();
        System.out.println(car.getTier());
    }
}
