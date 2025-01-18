package javaOOP.application;

import javaOOP.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("denarahmaron", "rahasia");
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Ciro"));
        System.out.println(new LoginRequest("David", "secret"));
    }
}
