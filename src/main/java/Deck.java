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

    /** Removes and return last card */
    public Card popCard(){
        Card top = cards.get(cards.size() - 1);
        cards.remove(cards.size() - 1);
        return top;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}
