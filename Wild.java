public class Wild extends Card implements Actionable {

    public Wild() {
        this.color = Color.noColor;
    }

    @Override
    public boolean canBePlayed(Card card) {
        return true;
    }

    @Override
    public void applyEffect(Game game, Player player) {
        // color already chosen in Game
    }

    @Override
    public String toString() {
        if (color == Color.noColor) {
            return "Wild";
        }
        return "Wild (" + color + ")";
    }

    @Override
    protected void setColor(Color chosenColor) {
        this.color = chosenColor;
    }
}
