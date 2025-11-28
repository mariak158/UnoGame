

	public class NumberCard extends Card{
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
	
	   public Number getNumber() {
		return this.number;
		   
	   }
	   public String toString() {
	        return color.toString() + " " + number;
	    }
	}


