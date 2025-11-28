
public class DrawTwo extends Card {

	@Override
	public boolean canBePlayed(Card card) {
		
		return this.color==card.getColor()||card instanceof DrawTwo;
	}

}
