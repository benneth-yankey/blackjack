import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("blackjack game");

        // initialize game
        BlackJack game = new BlackJack(new Deck(), 3);

        // start game
        game.play();

        System.out.println(game.getPlayers());
    }
}
