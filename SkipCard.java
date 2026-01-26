
public class SkipCard extends Card implements Actionable {
	  public SkipCard(Color color) {
	        this.color = color;
	    }

	@Override
	public boolean canBePlayed(Card card) {
		
		return this.color == card.getColor()||card instanceof SkipCard;
	}

	@Override
	public void applyEffect(Game game, Player player) {
		// depend on the game the next palyer 
		
	}
	public String toString() {
        return this.color.toString() + " Skip";
    }

}
