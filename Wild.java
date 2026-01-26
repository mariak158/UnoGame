
public class Wild extends Card implements Actionable{

	public Wild() {
        this.color = Color.noColor;
    }
	@Override
	public boolean canBePlayed(Card card) {
		
		return true;
	}

	@Override
	public void applyEffect(Game game, Player player) {
	//game.discardpileColor=player.
		
	}
	
	
	public String toString() {
        return "Wild";
    }

}
