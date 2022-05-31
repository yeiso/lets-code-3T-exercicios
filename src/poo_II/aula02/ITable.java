package poo_II.aula02;

public interface ITable {

    void insertDeck(Deck deck);
    void playThisCard(Card card, Player player);
    String verifyMatchWinner();
}
