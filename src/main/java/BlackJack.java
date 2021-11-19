import java.util.ArrayList;
import java.util.List;

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
        System.out.println("...Shuffling game .....");
        deck.shuffleCards();
        createPlayers();
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
//    public void deal(){
//        int dealRounds = 2;
////        int removeCount =
//        List<Card> cards = deck.getCards();
//        for (int i = 0; i < dealRounds; i++){
//            players.stream().map(p-> {p.setCardsInHand(cards.get(cards.size()-1)); cards.remove(cards.size()-1);})
//        }
//    }
}
