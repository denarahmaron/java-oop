package javaOOP.application;

import javaOOP.data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Indomie", 3000);
        System.out.println(product.productName);
        System.out.println(product.price);

        Product product2 = new Product("Indomie", 3000);
        System.out.println(product2.productName);
        System.out.println(product2.price);

        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());
    }
}
