package poo_II.aula05;

import java.util.List;

public class Toy extends Item{

    protected List<ToyType> types;

    public Toy(int id, String name, double price, List<ToyType> types) {
        super(id, name, price);
        this.types = types;
    }

    public List<ToyType> getTypes() {
        return types;
    }

    public void setTypes(List<ToyType> types) {
        this.types = types;
    }
}
