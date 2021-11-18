import java.util.List;

public class Player {
    private String name;
    private List<Card> cardsInHand;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Card> getCardsInHand() {
        return cardsInHand;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", cardsInHand=" + cardsInHand +
                '}';
    }
}
