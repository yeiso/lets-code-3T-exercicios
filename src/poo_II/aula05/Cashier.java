package poo_II.aula05;

import java.util.List;

public class Cashier {

    int id;
    private double cashierMoney;
    List<Stock> stocks;

    public Cashier(int id, double cashierMoney, List<Stock> stocks) {
        this.id = id;
        this.cashierMoney = cashierMoney;
        this.stocks = stocks;
    }

    void sellItem(List<IItem> itemList, int stockId){
        Stock selectedStock = StockManager.findStock(stocks, stockId);

        if (selectedStock != null){
            for (IItem item: itemList ) {
                if (StockManager.checkQuantityInStock(selectedStock, item) > 0){
                    StockManager.removeItemFromStock(selectedStock, item, 1);
                    setCashierMoney(getCashierMoney() + item.getPrice());
                }
            }
        }
    }

    public int getId() {
        return id;
    }

    private double getCashierMoney() {
        return cashierMoney;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    private void setCashierMoney(double cashierMoney) {
        this.cashierMoney = cashierMoney;
    }
}
