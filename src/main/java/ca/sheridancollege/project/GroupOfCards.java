/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards<T extends Card> {

    //The group of cards, stored in an ArrayList
    private ArrayList<T> cards;

    public GroupOfCards(ArrayList<T> cards) {
        this.cards = cards;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<T> getCards() {
        return cards;
    }

    public T popCard() {
        return cards.removeFirst();
    }
    
    public void addCard(T card){
        cards.add(card);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

}//end class
