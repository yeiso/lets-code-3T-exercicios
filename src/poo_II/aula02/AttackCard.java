package poo_II.aula02;

public class AttackCard extends BasicCard{

    private int power;
    private int resistence;

    public AttackCard(String name, int cost, CardType type, int power, int resistence) {
        super(name, cost, type);
        this.power = power;
        this.resistence = resistence;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getResistence() {
        return resistence;
    }

    public void setResistence(int resistence) {
        this.resistence = resistence;
    }
}
