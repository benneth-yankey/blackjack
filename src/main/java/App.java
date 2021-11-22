package io.turntabl;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("blackjack game");

        Deck deck = new Deck();
        Strategy basicStrategy = new Strategy();

        // initialize game
        BlackJack game = new BlackJack(deck, basicStrategy, 3);

        // start game
        game.play();


//        System.out.println(game.getPlayers());

//        game.gameStrategy();



//        System.out.println();
//        System.out.println( deck.getCards().size());
//        System.out.println("================= after ");
//        System.out.println(deck.popCard());
//        System.out.println(deck.getCards());
//        System.out.println( deck.getCards().size());
    }
}
