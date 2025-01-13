package javaOOP.data;

public class Bus implements Car {
    @Override
    public void drive() {
        System.out.println("Driving Bus");
    }

    @Override
    public int getTier() {
        return 8;
    }

    @Override
    public String getBrand() {
        return "Mercedes";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }

    @Override
    public boolean isBig() {
        return true;
    }
}
