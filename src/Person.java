class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    Person(String name){
        this.name = name;
    }

    Person(){
    }

    void sayHello(String paramName){
        System.out.println("Hello " + name + " My name is " + this.name );
    }
}
