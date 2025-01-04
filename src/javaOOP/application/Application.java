package javaOOP.application;

import javaOOP.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Mac Book Pro", 20_000_000);
        System.out.println(product.productName);
        System.out.println(product.price);
  }
}
