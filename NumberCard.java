public class NumberCard extends Card {

    private int number;

    public NumberCard(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public boolean canBePlayed(Card card) {
        return this.color == card.getColor() || (card instanceof NumberCard && ((NumberCard) card).number == this.number);
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return color + " " + number;
    }

    @Override
    protected void setColor(Color chosenColor) {
        this.color = chosenColor;
    }
}
