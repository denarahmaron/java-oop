public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Denar", "Cirebon");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Budi");

        Person person2 = new Person("Tobi", "Konoha");

        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.country);
        person2.sayHello("Mr. Robot");

        Person person3;
        person3 = new Person("Ciro", "Bandung");

        System.out.println(person3.name);
        System.out.println(person3.address);
        System.out.println(person3.country);
        person3.sayHello("David");

    }
}
