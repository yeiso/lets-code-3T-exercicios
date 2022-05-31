package poo_II.aula02;

import java.util.ArrayList;

public abstract class Table implements ITable{

    int maxPlayers;
    int deckSize;
    ArrayList<Deck> decks;
    ArrayList<Player> players;

    @Override
    public void playThisCard(Card card, Player player) {
    }
}
