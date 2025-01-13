package javaOOP.application;

import javaOOP.data.Avanza;
import javaOOP.data.Bus;

public class CarApp {
    public static void main(String[] args) {
        var car = new Avanza();
        car.drive();
        System.out.println(car.getTier());
        System.out.println(car.getBrand());
        System.out.println(car.isMaintenance());

        var bus = new Bus();
        bus.drive();
        System.out.println(bus.getTier());
        System.out.println(bus.getBrand());
        System.out.println(bus.isMaintenance());
        System.out.println(bus.isBig());
    }
}
