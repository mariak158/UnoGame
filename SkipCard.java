
public class SkipCard extends Card {


	@Override
	public boolean canBePlayed(Card card) {
		
		return this.color == card.getColor()||card instanceof SkipCard;
	}

}
