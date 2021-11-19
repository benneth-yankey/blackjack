package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class BlackJack {
    private Deck deck;
    private List<Player> players;
    private int numberOfPlayers;
    private Strategy strategy;

    public BlackJack(Deck deck, Strategy strategy,  int numberOfPlayers) {
        this.deck = deck;
        this.numberOfPlayers = numberOfPlayers;
        this.strategy = strategy;
    }

    /**
     * display or print players (gui sort of)
     */
    public void printStatus() {
        for (Player player : players) {
            System.out.println("----- " + player.getName() + " -----");
            String cards = "Cards: ";
            for (Card card : player.getCardsInHand()) {
                Face face = card.getFace();
                if( face.getValue() == 10 || face.getValue() == 11){
                    cards += card.getFace()  + " " + card.getSuit() + " ";
                }else{
                    cards += card.getFace().getValue() + " " + card.getSuit() + " ";
                }
            }
            System.out.println(cards);
            System.out.println("Total Weight: " + player.getCardsWeight());
            System.out.println();
//    ♣︎ 🖤 💎 ♠\
        }
    }

    /**
     * starts the game
     */
    public void play() {
        boolean gameIsOn = true;
        int stickCount = 0;

        System.out.println("========== Shuffling ===========");
        deck.shuffleCards();
        createPlayers();

        System.out.println("========== Dealing ===========");
        deal();

        // display player cards
        printStatus();

        // check if any of the players win game

        while (gameIsOn) {
            for (Player player : players) {

                // Win
                if (player.getCardsWeight() == 21) {
                    System.out.println(player.getName() + " has won the game!");
                    System.out.println("End of game!!");
                    gameIsOn = false;
                }

                // Hit
                else if (player.getCardsWeight() < 17) {
                    System.out.println(player.getName() + " just hit...");
                    Card newCard = deck.popCard();
                    player.setCardsInHand(newCard);
                    player.setCardsWeight(newCard.getFace().getValue());
                }

                // Bust
                else if (player.getCardsWeight() > 21) {
                    System.out.println(player.getName() + " card weights greater than 21, go bust!!!");
                    players.remove(player);
                }

                // Stick
                else if (player.getCardsWeight() >= 17) {
                    System.out.println(player.getName() + " just stick...");
                    stickCount++;
                }
            }
        }
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

    /** Game Strategy */
//    public void gameStrategy(){
////        boolean playerWon = false;
//       while (true){
//           for(Player p : players){
//               int playerWeight = p.getCardsWeight();
////               if(playerWeight < 17){
////                   strategy.hit(p, deck);
////               }
////               else if(playerWeight < 21 ){
////                   strategy.stick(p);
////               }
//               if( playerWeight == 21){
//                   System.out.println("player wins");
//                   break;
//               }
//           }
//       }
//    }


}
