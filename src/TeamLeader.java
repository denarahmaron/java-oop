class TeamLeader extends Employee {
    TeamLeader(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("Hello " + name + ", my name is TeamLeader " + this.name);
    }
}
