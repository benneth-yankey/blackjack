package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> cardsInHand;

    public Player(String name) {
        this.name = name;
        this.cardsInHand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Card> getCardsInHand() {
        return cardsInHand;
    }

    public void setCardsInHand(Card card) {
        this.cardsInHand.add(card);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", cardsInHand=" + cardsInHand +
                '}';
    }
}
