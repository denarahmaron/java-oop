package javaOOP.application;

import javaOOP.data.City;

public class LocationApp {
    public static void main(String[] args) {
        var city = new City();
        city.name = "Bandung";
        System.out.println(city.name);
    }
}
