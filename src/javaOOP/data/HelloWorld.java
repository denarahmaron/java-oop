package javaOOP.data;

import javaOOP.annotation.Fancy;

@Fancy(name = "HelloWorld")
public interface HelloWorld {
    void sayHello();

    void sayHello(String name);
}
