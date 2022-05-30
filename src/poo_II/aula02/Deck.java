package poo_II.aula02;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private int id;
    protected ArrayList<BasicCard> cards;

    public Deck(int id, ArrayList<BasicCard> cards) {
        this.id = id;
        this.cards = cards;
    }

     public void deckShuffle(){
       Collections.shuffle(this.cards);
    }

    public int getId() {
        return id;
    }

    public ArrayList<BasicCard> getCards() {
        return cards;
    }

    public void setCards(ArrayList<BasicCard> cards) {
        this.cards = cards;
    }
}
