package poo_II.aula02;

import java.util.ArrayList;

public class PartyTable extends Table{

    int maxCardsOnTable;
    ArrayList<Card> cardsOnTable;
    ArrayList<Player> playersAlive = new ArrayList<>();

    public PartyTable(){
        this.deckSize = 80;
        this.maxCardsOnTable = 34;
        this.maxPlayers = 5;
    }
    public PartyTable(ArrayList<Deck> decks, ArrayList<Player> players){
        this.deckSize = 80;
        this.maxCardsOnTable = 34;
        this.maxPlayers = 5;
        this.decks = decks;
        this.players = players;
        this.cardsOnTable = new ArrayList<>();
    }

    @Override
    public void insertDeck(Deck deck) {
        if (this.decks.size() < maxPlayers && deck.cards.size() <= deckSize){
            decks.add(deck);
        }
    }

    @Override
    public void playThisCard(Card card, Player player) {
        if (card.getCost() < player.getActionPoints() && cardsOnTable.size() < maxCardsOnTable){
            cardsOnTable.add(card);
        }
    }

    @Override
    public String verifyMatchWinner() {
        playersAlive.clear();

        for (Player player: players){
            if (player.getLifePoints() > 0){
                playersAlive.add(player);
            }
        }

        if (playersAlive.size() == 1){
            return playersAlive.get(0).getName() + "IS THE WINNER!";
        }

        return null;
    }
}
