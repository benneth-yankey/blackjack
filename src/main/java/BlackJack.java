package io.turntabl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BlackJack {
    private Deck deck;
    private List<Player> players;
    private int numberOfPlayers;

    public BlackJack(Deck deck, int numberOfPlayers) {
        this.deck = deck;
        this.numberOfPlayers = numberOfPlayers;
    }

    /**
     * starts the game
     */
    public void play() {
        System.out.println("========== Shuffling ===========");
        deck.shuffleCards();
        createPlayers();

        System.out.println("========== Dealing ===========");
        deal();
    }

    /**
     * gets the current players of the game
     * @return list of players
     */
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * Create number of players
     */
    private void createPlayers() {
        players = new ArrayList<>();
        for (int i = 1; i <= numberOfPlayers; i++) {
            Player player = new Player("Player " + i);
            players.add(player);
        }
    }

    /** Dealing Cards */
    public void deal(){
        int dealRounds = 2;
        for (int i = 0; i < dealRounds; i++){
            for(Player p : players){
                Card poppedCard = deck.popCard();
                p.setCardsInHand(poppedCard);
                p.setCardsWeight(poppedCard.getFace().getValue());
            }
        }
    }
}
