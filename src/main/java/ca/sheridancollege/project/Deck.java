package ca.sheridancollege.project;

import java.util.ArrayList;

class Deck extends GroupOfCards {
    
    String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
    String[] faces = {
        "2", "3", "4", "5", "6", "7", "8", "9",
        "Ace", "Jack", "Queen", "King"
    };
    
    private int size;
    
    Deck() {
        super(new ArrayList<StandardCard>());
        size = 52;
        for (String suit : suits) {
            for (String face : faces) {
                addCard(new StandardCard(suit, face));
            }
        }
    }

}
