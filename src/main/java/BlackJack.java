import java.util.List;

public class BlackJack {
    private Deck deck;
    private List<Player> players;

    public BlackJack(Deck deck) {
        this.deck = deck;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(int n){
        for (int i= 0; i <n ; i++) {
            Player player = new Player("Player" + Integer.toString(i));
            players.add(player);
        }
    }
}
