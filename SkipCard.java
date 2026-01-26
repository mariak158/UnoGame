public class SkipCard extends Card implements Actionable {

    public SkipCard(Color color) {
        this.color = color;
    }

    @Override
    public boolean canBePlayed(Card card) {
        return this.color == card.getColor() || card instanceof SkipCard;
    }

    @Override
    public void applyEffect(Game game, Player player) {
        game.skipNextPlayer();
    }

    @Override
    public String toString() {
        return this.color + " Skip";
    }

    @Override
    protected void setColor(Color chosenColor) {
        this.color = chosenColor;
    }
}

