package poo_II.aula02;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private int id;
    protected ArrayList<Card> cards;

    public Deck(int id, ArrayList<Card> cards) {
        this.id = id;
        this.cards = cards;
    }

     public void deckShuffle(){
       Collections.shuffle(this.cards);
    }

    public int getId() {
        return id;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
