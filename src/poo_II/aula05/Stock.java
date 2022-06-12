package poo_II.aula05;

import java.util.Map;

public class Stock {

    int id;
    Map<IItem, Integer> stockedItens;

    public Stock(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Map<IItem, Integer> getStockedItens() {
        return stockedItens;
    }
}
