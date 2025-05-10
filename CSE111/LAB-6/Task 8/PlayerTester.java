public class PlayerTester {
    public static void main(String[] args) {
        // Display the total number of players initially
        System.out.println("Total number of players: " + Player.total);
        System.out.println("1------------------");
//
        // Creating the first player "Neymar"
        Player p1 = new Player("Neymar", "Brazil", 5);
        System.out.println(p1.player_detail());
        System.out.println("===================");
        Player.info();
//
        System.out.println("2------------------");

        // Creating the second player "Ronaldo"
        Player p2 = new Player("Ronaldo", "Portugal", 7);
        System.out.println(p2.player_detail());
        System.out.println("===================");
        Player.info();

        System.out.println("3------------------");

        // Creating the third player "Messi"
        Player p3 = new Player("Messi", "Argentina", 6);
        System.out.println(p3.player_detail());
        System.out.println("===================");
        Player.info();

        System.out.println("4------------------");

        // Creating the fourth player "Mbappe"
        Player p4 = new Player("Mbappe", "France", 10);
        System.out.println(p4.player_detail());
        System.out.println("===================");
        Player.info();
    }
}
