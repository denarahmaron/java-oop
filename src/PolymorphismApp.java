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
        if(employee instanceof TeamLeader teamLeader){
            System.out.println("Hello TeamLeader " + teamLeader.name);
        } else if(employee instanceof Manager manager){
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
