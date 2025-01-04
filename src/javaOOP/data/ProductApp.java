package javaOOP.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Indomie", 3000);
        System.out.println(product.productName);
        System.out.println(product.price);
    }
}
