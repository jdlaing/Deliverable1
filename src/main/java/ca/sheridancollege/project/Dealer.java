package ca.sheridancollege.project;

import java.util.ArrayList;

class Dealer extends Player {
    boolean hiddenCard;

    public Dealer(Deck deck, Human human) {
        super("Dealer");
        deck.shuffle();
        human.draw(deck);
        draw(deck);
        hiddenCard = true;
        human.draw(deck);
        draw(deck);
    }
    
    @Override
    public void play() {
        ArrayList<StandardCard> cards = this.getHand().getCards();
        System.out.print("Dealers hand is: [");
        for (int i = 0; i < cards.size(); i++){
            if (i == 0 && hiddenCard) {
                System.out.print("(Face down card)");
            } else if (i==0) {
                System.out.print(cards.get(i));
            } else {
                System.out.printf(", %s", cards.get(i));
            }
        }
        System.out.println("]");
    }
    
    void hit(Deck deck) {
        this.hiddenCard = false;
        this.draw(deck);
    }

    boolean isStanding() {
        return this.getHand().getTotal() > 17;
    }
    
}
