import java.util.ArrayList;
import java.util.Scanner;

public class maingame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();

        System.out.print("Enter number of players: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name for player " + (i + 1) + ": ");
            String name = scanner.nextLine();
            players.add(new Player(name));
        }

        Game game = new Game(players);
        game.start();
    }
}
		
		