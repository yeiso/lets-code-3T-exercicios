package poo_II.aula05;

import java.util.List;

class StockManager {

    private StockManager(){}

    static void addItemToStock(Stock stock, IItem item, Integer quantity){

        boolean productExists = stock.stockedItens.containsKey(item);

        if(productExists){
            //If Item is already a key, I just updates its value adding the 'quantity'
            stock.stockedItens.put(item, stock.stockedItens.get(item) + quantity);
        }
        stock.stockedItens.put(item, quantity);
    }

    static void removeItemFromStock(Stock stock, IItem item, Integer quantity){

        boolean productExists = stock.stockedItens.containsKey(item);

        if(productExists){
            if (quantity <= stock.stockedItens.get(item) ) {
                stock.stockedItens.put(item, stock.stockedItens.get(item) - quantity);
            } else {
                System.out.println("ERROR: Stock ID " + stock.getId() + " doesn't have the required amount of itens");
            }
        } else {
            System.out.println("ERROR: Requested Item doesn't exists in Stock ID: " + stock.getId());
        }
    }

    static void updateItemQuantity(Stock stock, IItem item, Integer quantity){

        boolean productExists = stock.stockedItens.containsKey(item);

        if(productExists){
            stock.stockedItens.put(item, quantity);
        }
    }

    static Stock findStock(List<Stock> stocks, int stockId){
        for (Stock stock: stocks) {
            if (stockId == stock.getId()){
                return stock;
            }
        }
        return null;
    }

    static int checkQuantityInStock(Stock stock, IItem item){
        boolean productExists = stock.stockedItens.containsKey(item);

        if(productExists){
            return stock.stockedItens.get(item);
        }
        return 0;
    }




}
