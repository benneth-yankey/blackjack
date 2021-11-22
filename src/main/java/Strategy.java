package io.turntabl;

public class Strategy {

    public void hit(Player p, Deck deck){
        Card newCard = deck.popCard();
        p.setCardsInHand(newCard);
        p.setCardsWeight(newCard.getFace().getValue());
        System.out.println("Player" + p.getName() + "  hit with new card " + newCard);
        System.out.println("New weight is " + p.getCardsWeight());
    }

    public void stick(Player p){
        System.out.println("Player" + p.getName() + "  stick with weight " +  p.getCardsWeight());
    }

    public void goBust(Player p){
        System.out.println("Player" + p.getName() + "'s weight is  " + p.getCardsWeight());
        System.out.println("Weight is greater than 21  .... Go Bust");
    }
}
