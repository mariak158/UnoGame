public abstract class Card {

    protected Color color;

    public abstract boolean canBePlayed(Card card);

    public Color getColor() {
        return this.color;
    }

    protected abstract void setColor(Color chosenColor);
}
