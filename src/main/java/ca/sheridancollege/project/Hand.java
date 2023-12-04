package ca.sheridancollege.project;

import java.util.ArrayList;

class Hand<T extends StandardCard> extends GroupOfCards {
    
    public Hand() {
        super(new ArrayList<T>());
    }
    
    int getTotal() {
        int sum = 0;
        for(T card : (ArrayList<T>)this.getCards()) {
            sum += card.value;
        }
        return sum;
    }
    
    @Override
    public String toString(){
        return getCards().toString();
    }
}
