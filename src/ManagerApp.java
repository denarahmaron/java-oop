public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Eko");
        manager.sayHello("Budi");

        var teamLeaderMarketing = new TeamLeader("Agus");
        teamLeaderMarketing.sayHello("Hendra");
    }
}
