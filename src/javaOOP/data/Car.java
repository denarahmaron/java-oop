package javaOOP.data;

import javaOOP.annotation.Fancy;

@Fancy(name = "Car")
public interface Car extends HasBrand, IsMaintenance{
    void drive();

    int getTier();

    default boolean isBig(){
        return false;
    }
}
