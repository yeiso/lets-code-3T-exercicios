package poo_II.aula02;

import java.util.ArrayList;

public class VersusTable extends Table {

    ArrayList<BasicCard> playersCardOnTable = new ArrayList<>();

    public VersusTable(){
        this.deckSize = 50;
        this.maxPlayers = 2;
    }

    public VersusTable(ArrayList<Deck> decks, ArrayList<Player> players){
        this.deckSize = 50;
        this.maxPlayers = 2;
        this.decks = decks;
        this.players = players;
    }

    @Override
    public void insertDeck(Deck deck) {
        if (decks.size() < maxPlayers && deck.cards.size() <= deckSize){
            decks.add(deck);
        }
    }

    @Override
    public void canPlayThisCard(BasicCard card, Player player) {

    }

    @Override
    public String verifyMatchWinner() {

        if (players.get(0).getLifePoints() > 0 && players.get(1).getLifePoints() <= 0){
            return players.get(0).getName() + "IS THE WINNER!";
        } else if (players.get(1).getLifePoints() > 0 && players.get(0).getLifePoints() <= 0){
            return players.get(1).getName() + "IS THE WINNER!";
        }

        return null;

    }
}
