

	public class NumberCard extends Card{

		public enum Number {
			zero,one,two,three,four,five,six,seven,eight,nine}
		//the attributs
	   private Number number;
	   //the constractor
       public NumberCard(Color color,Number number) {
	     this.color=color;
	     this.number=number;
  }
      // redefine the canbeplayd
	   @Override
	
	 public  boolean canBePlayed(Card card) {
		 //if the left side is false java will not verifie the right side//
		return this.color==card.color ||(card instanceof NumberCard&&((NumberCard)card).number==this.number);
	   } 
	   //the aplay effect 

	}


