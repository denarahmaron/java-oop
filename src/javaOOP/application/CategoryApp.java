package javaOOP.application;

import javaOOP.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("ID123");
        System.out.println(category.getId());

        category.setExpensive(true);
        System.out.println(category.isExpensive());
    }
}
