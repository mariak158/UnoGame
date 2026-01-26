public abstract class Card {

    protected Color color;

    public abstract boolean canBePlayed(Card card);

    public Color getColor() {
        return this.color;
    }

    // every card must implement this
    protected abstract void setColor(Color chosenColor);
}
