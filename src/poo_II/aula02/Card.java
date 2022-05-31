package poo_II.aula02;

public abstract class Card {

    protected String name;
    protected int cost;
    protected CardType type;

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public CardType getType() {
        return type;
    }

    public Card(String name, int cost, CardType type) {
        this.name = name;
        this.cost = cost;
        this.type = type;
    }
}
