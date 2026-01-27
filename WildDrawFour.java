public class WildDrawFour extends Wild implements Actionable {

    @Override
    public void applyEffect(Game game, Player player) {
        Player next = game.getNextPlayer();
        for (int i = 0; i < 4; i++) {
            next.drawCard(game.getDeck().draw());
        }
    }

    @Override
    public String toString() {
        if (color == Color.noColor) {
            return "Wild Draw Four";
        }
        return "Wild Draw Four (" + color + ")";
    }
}
