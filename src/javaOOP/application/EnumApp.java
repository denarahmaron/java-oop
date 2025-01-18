package javaOOP.application;

import javaOOP.data.Customer;
import javaOOP.data.Level;

import java.sql.SQLOutput;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Denar");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("STANDARD");
        System.out.println(level);

        for(var value : Level.values()){
            System.out.println(value);
        }
    }
}
