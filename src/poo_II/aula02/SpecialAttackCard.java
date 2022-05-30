package poo_II.aula02;

import java.util.ArrayList;

public class SpecialAttackCard extends AttackCard{

    ArrayList<SpecialAttackEffect> effects;

    public SpecialAttackCard(String name, CardType type, int cost, int power, int resistence, ArrayList<SpecialAttackEffect> effects) {
        super(name, type, cost, power, resistence);
        this.effects = effects;
    }
}
