package javaOOP.application;

import javaOOP.data.CreateUserRequest;
import javaOOP.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Denar");
        request.setPassword("rahasia");

        ValidationUtil.validationReflection(request);

    }
}
