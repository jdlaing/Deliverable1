package ca.sheridancollege.project;

import java.util.Scanner;

class Human extends Player {

    Scanner stdin;
    Deck deck;
    private boolean isStanding;

    public Human(){
        super("Human");
    }

    public Human(Scanner stdin, Deck deck) {
        super("Human");
        this.stdin = stdin;
        this.deck = deck;
    }

    @Override
    public void play() {
        System.out.println("Your hand is: " + this.getHand().getTotal() 
                                          + " " + this.getHand());
        System.out.print("Would you like to hit or stand: ");
        
        while (true) {
            String choice = stdin.next();
            if (choice.toLowerCase().equals("hit")) {
                hit();
                break;
            } else if (choice.toLowerCase().equals("stand")) {
                stand();
                break;
            } 
            System.out.println("Choice not valid. Try either 'hit' or 'stand'");
        }
    }

    public void hit() {
        this.getHand().addCard(deck.popCard());
    }

    public void stand() {
        isStanding = true;
    }
    public boolean isStanding() {
        return this.isStanding;
    }
}
