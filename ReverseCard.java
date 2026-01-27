public class ReverseCard extends Card implements Actionable {

    public ReverseCard(Color color) {
        this.color = color;
    }

    @Override
    public boolean canBePlayed(Card card) {
        return this.color == card.getColor() || card instanceof ReverseCard;
    }

    @Override
    public void applyEffect(Game game, Player player) {
        game.reverseDirection();
        System.out.println("Direction reversed");

    }

    @Override
    public String toString() {
        return this.color + " Reverse";
    }

    @Override
    protected void setColor(Color chosenColor) {
        this.color = chosenColor;
    }
}

