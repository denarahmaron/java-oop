package javaOOP.data;

public record LoginRequest(String username, String password) {
    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest(){
        this("","");
    }
}
