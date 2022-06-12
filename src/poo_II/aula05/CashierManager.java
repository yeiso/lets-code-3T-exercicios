package poo_II.aula05;

import java.util.List;

class CashierManager {

    private CashierManager(){}

    protected static double verifyBookDiscount(List<IItem> items){

        double discount = 0;
        double bookPriceSum = 0;

        for (IItem item: items) {
            if (item instanceof Book){
                bookPriceSum += item.getPrice();
            }
        }

        if (bookPriceSum > 200d){
            discount = bookPriceSum * 0.15;
        }
        return discount;
    }

    protected static boolean verifyAdultItem(IItem item, Client client){
            if (item instanceof AdultItem){
                return isAdult(client);
            }
        return true;
    }


    protected static boolean isAdult(Client client){
        return client.getAge() >= 18;
    }

}
