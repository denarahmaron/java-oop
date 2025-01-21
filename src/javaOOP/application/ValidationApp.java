package javaOOP.application;

import javaOOP.data.LoginRequest;
import javaOOP.error.ValidationException;
import javaOOP.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Ciro", null);

        try{
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException e){
            System.out.println("Terjadi error dengan pesan : " + e.getMessage());
        } finally {
            System.out.println("Selesai");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
    }
}
