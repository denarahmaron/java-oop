package javaOOP.application;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            sampleError();
        }catch (RuntimeException exception){
            exception.printStackTrace();
        }
    }
    public static void sampleError(){
        try {
            String[] names = {
                    "Denar", "Ahmaron", "Surya"
            };
            System.out.println(names[100]);
        }catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
