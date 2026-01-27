public class DrawTwo extends Card implements Actionable {

    public DrawTwo(Color color) {
        this.color = color;
    }

    @Override
    public boolean canBePlayed(Card card) {
        return this.color == card.getColor() || card instanceof DrawTwo;
    }

    @Override
    public void applyEffect(Game game, Player player) {
        Player next = game.getNextPlayer();
        for (int i = 0; i < 2; i++) {
            next.drawCard(game.getDeck().draw());
        }
     
    }

    @Override
    public String toString() {
        return this.color + " Draw Two";
    }

    @Override
    protected void setColor(Color chosenColor) {
        this.color = chosenColor;
    }
}
