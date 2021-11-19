package io.turntabl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        createCards();
    }

    /** Create list of cards */
    public void createCards() {
        for (Suit suit : Suit.values()) {
            for (Face face : Face.values()) {
               cards.add(new Card(face, suit));
            }
        }
    }

    /** Get the list of cards */
    public List<Card> getCards() {
        return cards;
    }

    /** Shuffle list of cards */
    public void shuffleCards(){
        Collections.shuffle(getCards());
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}
