

public abstract class Card {

	    //But we’ll need logic later to let the player choose a color when playing a Wild
	protected  Color color;
    
   public abstract boolean canBePlayed(Card card);

   public Color getColor() {
	return this.color;
   }
   
}
