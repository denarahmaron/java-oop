package javaOOP.data;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return price == product.price && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(productName);
        result = 31 * result + price;
        return result;
    }
}
