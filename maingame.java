import java.util.ArrayList;
import java.util.Scanner;

public class maingame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();

        int n = 0;
        while (true) {
            System.out.print("Enter number of players: ");
            try {
                n = Integer.parseInt(scanner.nextLine()); 
                if (n >= 2 && n <= 10) { 
                    break;
                } else {
                    System.out.println("Please enter a number between 2 and 10.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name for player " + (i + 1) + ": ");
            String name = scanner.nextLine();
            players.add(new Player(name));
        }

        Game game = new Game(players);
        game.start();
    }
}
