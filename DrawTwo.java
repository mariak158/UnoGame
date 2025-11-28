
public class DrawTwo extends Card  implements Actionable{

	@Override
	public boolean canBePlayed(Card card) {
		
		return this.color==card.getColor()||card instanceof DrawTwo;
	}

	@Override
	public void applyEffect(Game game, Player player) {
		for(int i=0;i<2;i++) {
		//nextplayer.draw(game.deck);	
	}}

	
	 public String toString() {
	        return this.color.toString() + " Draw Two";
	    }
}
