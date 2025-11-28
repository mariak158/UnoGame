
public class WildDrawFour extends Wild implements Actionable{

	@Override
	public void applyEffect(Game game, Player player) {
		//chose the color ...
		// next player  add 4
		for(int i=1 ; i<4; i++) {
			//nextplayer.drawCard(game.deck);
		}
		
	}
	public String toString() {
        return "Wild Draw Four";
    }

}
