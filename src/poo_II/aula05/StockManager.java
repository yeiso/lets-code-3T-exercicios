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

    static void deleteItemFromStock(Stock stock, IItem item){

        boolean productExists = stock.stockedItens.containsKey(item);

        if(productExists) {
            stock.stockedItens.remove(item);
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

    static int checkQuantityInStock(Stock stock, IItem item){
        boolean productExists = stock.stockedItens.containsKey(item);

        if(productExists){
            return stock.stockedItens.get(item);
        }
        return 0;
    }

    static Stock findStock(List<Stock> stocks, int stockId){
        for (Stock stock: stocks) {
            if (stockId == stock.getId()){
                return stock;
            }
        }
        return null;
    }

    static void listItensInStock(Stock stock){
        for (IItem item: stock.stockedItens.keySet()) {
            System.out.println(item.toString() + " - Quantity: " + stock.stockedItens.get(item));
        }
    }

    static void listBooksInStock(Stock stock){
        for (IItem item: stock.stockedItens.keySet()) {
            if (item instanceof Book) {
                System.out.println(item + " - Quantity: " + stock.stockedItens.get(item));
            }
        }
    }

    static void listMoviesInStock(Stock stock){
        for (IItem item: stock.stockedItens.keySet()) {
            if (item instanceof Movie) {
                System.out.println(item + " - Quantity: " + stock.stockedItens.get(item));
            }
        }
    }

    static void listMusicAlbunsInStock(Stock stock){
        for (IItem item: stock.stockedItens.keySet()) {
            if (item instanceof MusicAlbum) {
                System.out.println(item + " - Quantity: " + stock.stockedItens.get(item));
            }
        }
    }

    static void listToysInStock(Stock stock){
        for (IItem item: stock.stockedItens.keySet()) {
            if (item instanceof Toy) {
                System.out.println(item + " - Quantity: " + stock.stockedItens.get(item));
            }
        }
    }

    static void listVideoGamesInStock(Stock stock){
        for (IItem item: stock.stockedItens.keySet()) {
            if (item instanceof VideoGame) {
                System.out.println(item + " - Quantity: " + stock.stockedItens.get(item));
            }
        }
    }





}
