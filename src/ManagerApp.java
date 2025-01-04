public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Eko");
        manager.sayHello("Budi");

        var teamLeader = new TeamLeader("Agus");
        teamLeader.sayHello("Hendra");
    }
}
