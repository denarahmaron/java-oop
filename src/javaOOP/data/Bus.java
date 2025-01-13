package javaOOP.data;

public class Bus implements Car {
    public void drive() {
        System.out.println("Driving Bus");
    }

    public int getTier() {
        return 8;
    }

    public String getBrand() {
        return "Mercedes";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
