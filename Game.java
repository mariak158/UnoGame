import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private ArrayList<Player> players; 
// قائمة اللاعبين
    private Deck deck;          
    private Card currentCard;  // الكارت لي راهي فوق الطاولة
    private int currentPlayerIndex; // اندكس اللاعب الحالي
    private int direction; // اتجاه اللعب (1 أو -1)
   
    public Game(ArrayList<Player> players) {
        this.players = players;       
        this.deck = new Deck();         // نخدمو Deck جديد
        this.direction = 1;             // اللعب يبدأ في اتجاه عادي
        this.currentPlayerIndex = 0;    // نبداو بأول لاعب
       

        // نسحب أول كارت ونحطها فوق الطاولة
        this.currentCard = deck.draw();
    }

   // تشغيل اللعبة 
    public void start() {

Scanner scanner = new Scanner(System.in);

        // اللعبة تستمر حتى واحد يخلاصولو الكارتات في  يدو
        while (true) {

            Player player = players.get(currentPlayerIndex);

            System.out.println("\nCurrent card: " + currentCard);
            System.out.println(player.getName() + "'s turn");

            // اللاعب يخير كارت
            Card playedCard = player.playCard(currentCard, scanner);

            //إذا اللاعب ما قدرش يلعب سماتيك يسحب كارت
            if (playedCard == null) {
                Card drawn = deck.draw();
                player.addCard(drawn);
                System.out.println(player.getName() + " draws a card");
                nextTurn();
                continue;
            }

            // نحط الكارت الجديدة فوق الطابلة
            currentCard = playedCard;

            // HERE INSTANCEOF 
            // إذا الكارت عندها تأثير
            if (playedCard instanceof Actionable) {
                // نحولها لـ Actionable
                Actionable action = (Actionable) playedCard;

                // نطبق التأثير
                action.applyEffect(this, player);
            }

            // إذا اللاعب فرغ يدو  معنتهاي ربح
            if (player.handEmpty()) {
                System.out.println(player.getName() + " wins!");
                break;
            }

            // نمر للاعب التالي
            nextTurn();
        }
    }

    // نبدل اللاعب 
    public void nextTurn() {
        currentPlayerIndex =
                (currentPlayerIndex + direction + players.size())
                % players.size();
    }

    public Deck getDeck() {
        return deck;
    }

    public void skipNextPlayer() {
        nextTurn();
    }

    public void reverseDirection() {
        direction = -direction;
    }

    public Player getNextPlayer() {
        int index =
                (currentPlayerIndex + direction + players.size())
                % players.size();
        return players.get(index);
    }
}
