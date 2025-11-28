
public class ReverseCard extends Card implements Actionable {

	@Override
	public boolean canBePlayed(Card card) {
		
		return this.color==card.getColor() || (card instanceof ReverseCard);
	}

	@Override
	public void applyEffect(Game game, Player player) {
		if(game.direction==-1) {
			game.direction=1;
		}else {
			game.direction=-1;
		}
		
	}
	 
	 public String toString() {
	        return this.color.toString() + " Reverse";
	    }

}
