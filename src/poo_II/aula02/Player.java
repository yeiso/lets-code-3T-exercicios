package poo_II.aula02;

public class Player {

    private int id;
    private String name;
    protected int lifePoints = 20;
    protected int actionPoints = 1;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getLifePoints(){
        return lifePoints;
    }

    public void setLifePoints(int value){
        this.lifePoints = value;
    }

    public int getActionPoints(){
        return actionPoints;
    }

    public void setActionPoints(int value){
        this.actionPoints = value;
    }
}
