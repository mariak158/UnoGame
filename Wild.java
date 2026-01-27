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
    //chose the color in the game
    	System.out.println(player.getName() + " played a Wild card");

    }

    @Override
    public String toString() {
        if (color == Color.noColor) {
            return "Wild";
        }
        //to print the chosen color in the game
        return "Wild (" + color + ")";
    }

    @Override
    protected void setColor(Color chosenColor) {
        this.color = chosenColor;
    }
}
