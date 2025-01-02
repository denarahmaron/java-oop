public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Eko";
        manager.sayHello("Budi");

        var teamLeaderMarketing = new TeamLeader();
        teamLeaderMarketing.name = "Agus";
        teamLeaderMarketing.sayHello("Hendra");
    }
}
