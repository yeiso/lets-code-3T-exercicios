package poo_II.aula02;

public interface ITable {

    void insertDeck(Deck deck);
    void canPlayThisCard(BasicCard card, Player player);
    String verifyMatchWinner();
}
