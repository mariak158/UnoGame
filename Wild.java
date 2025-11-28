
public class Wild extends Card implements Actionable{


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
