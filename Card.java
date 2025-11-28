

public abstract class Card {
	public class Number {

	}

	public enum Color {
	    red,blue,green,yellow,noColor}
	    //But we’ll need logic later to let the player choose a color when playing a Wild
	protected Color color;
    
   public abstract boolean canBePlayed(Card card);

   public Color getColor() {
	return this.color;
   }
   
}
