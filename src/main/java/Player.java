package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> cardsInHand;
    private int cardsWeight;

    public Player(String name) {
        this.name = name;
        this.cardsInHand = new ArrayList<>();
        this.cardsWeight = 0;
    }

    public int getCardsWeight() {
        return cardsWeight;
    }

    public void setCardsWeight(int cardsWeight) {
        this.cardsWeight += cardsWeight;
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
                ", cardsWeight=" + cardsWeight +
                '}';
    }
}
