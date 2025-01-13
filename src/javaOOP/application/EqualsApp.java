package javaOOP.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Denar";
        first = first + " " + "Ahmaron";

        String second = "Denar Ahmaron";

        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
}
