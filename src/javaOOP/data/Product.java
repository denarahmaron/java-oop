package javaOOP.data;

public class Product {
    public String productName;
    public int price;

    public Product(String productName, int price){
        this.productName = productName;
        this.price = price;
    }

    public String toString() {
        return "Product Name : " + productName + ", Price : " + price;
    }
}
