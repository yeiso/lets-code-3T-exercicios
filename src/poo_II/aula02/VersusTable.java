package poo_II.aula02;

import java.util.ArrayList;

public class VersusTable extends Table {

    ArrayList<Card> AttackCardsPlayer0 = new ArrayList<>();
    ArrayList<Card> SpecialAttackCardsPlayer0 = new ArrayList<>();
    ArrayList<Card> AttackCardsPlayer1 = new ArrayList<>();
    ArrayList<Card> SpecialAttackCardsPlayer1 = new ArrayList<>();

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
    public void playThisCard(Card card, Player player) {
        if (player.getId() == 0){
            if (card instanceof SpecialAttackCard && SpecialAttackCardsPlayer0.size() < 2) {
                SpecialAttackCardsPlayer0.add(card);
            } else if (!(card instanceof SpecialAttackCard) && AttackCardsPlayer0.size() < 5) {
                AttackCardsPlayer0.add(card);
            }
        }

        if (player.getId() == 1){
            if (card instanceof SpecialAttackCard && SpecialAttackCardsPlayer1.size() < 2) {
                SpecialAttackCardsPlayer1.add(card);
            } else if (!(card instanceof SpecialAttackCard) && AttackCardsPlayer1.size() < 5) {
                AttackCardsPlayer1.add(card);
            }
        }
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
