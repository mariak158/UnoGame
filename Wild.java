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
        // nothing extra here, color is set when played
    }

    @Override
    public String toString() {
        return "Wild";
    }

    @Override
    protected void setColor(Color chosenColor) {
        this.color = chosenColor;
    }
}

