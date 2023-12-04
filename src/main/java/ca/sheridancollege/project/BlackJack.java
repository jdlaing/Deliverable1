package ca.sheridancollege.project;

import java.util.Scanner;

class BlackJack extends Game {

    Dealer dealer;
    Human human;
    String winner;
    public static void main(String[] args) {
        new BlackJack().play();
    }

    public BlackJack() {
        super("BlackJack");
    }

    @Override
    public void play() {
        Scanner stdin = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffle();
        human = new Human(stdin, deck);
        dealer = new Dealer(deck, human);

        System.out.println("Welcome to " + this.getName() + "!");

        while (!dealer.isBust() 
            && !human.isBust() 
            && (!human.isStanding() || !dealer.isStanding())
        ) {
            dealer.play();

            if (!human.isBust() && human.isStanding()) {
                dealer.hit(deck);
            } else if (!human.isBust()) {
                human.play();
            }
        }

        if(dealer.isBust()) {
            winner = "Human";
        } else if(human.isBust()) {
            winner = "Dealer";
        } else if (human.getHand().getTotal() > dealer.getHand().getTotal()){
            winner = "Human";
        } else {
            winner = "Dealer";
        }
        declareWinner();
    }
    
    @Override
    public void declareWinner() {
        System.out.println("============================");
        System.out.println(winner + " wins!");
        System.out.println("Dealer had: " + dealer.getHand().getTotal() + " " + dealer.getHand());
        System.out.println("Human had: " + human.getHand().getTotal() + " " + human.getHand());
        System.out.println("============================");
    }
    
}
