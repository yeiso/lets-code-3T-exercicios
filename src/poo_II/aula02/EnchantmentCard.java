package poo_II.aula02;

public class EnchantmentCard extends Card {

    int roundsDuration;
    int powerModFactor;
    AttackCard target;

    public EnchantmentCard(String name, int cost, CardType type, int roundsDuration, int powerModFactor, AttackCard target) {
        super(name, cost, type);
        this.roundsDuration = roundsDuration;
        this.powerModFactor = powerModFactor;
        this.target = target;
    }

    public EnchantmentCard(String name, int cost, CardType type, int roundsDuration, int powerModFactor) {
        super(name, cost, type);
        this.roundsDuration = roundsDuration;
        this.powerModFactor = powerModFactor;
    }

    public void setTarget(AttackCard target) {
        this.target = target;
    }
}
