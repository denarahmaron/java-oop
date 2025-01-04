class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Eko");
        employee.sayHello("Budi");

        employee = new Manager("Eko");
        employee.sayHello("Budi");

        employee = new TeamLeader("Eko");
        employee.sayHello("Budi");

        sayHello(new Employee("Denar"));
        sayHello(new Manager("Agus"));
        sayHello(new TeamLeader("Andi"));
    }
    static void sayHello(Employee employee){
        System.out.println("Hello " + employee.name);
    }
}
