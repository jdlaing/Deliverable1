/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author justin
 */
public class PlayerTest {

    /**
     * Test of draw method, of class Player.
     */
    @Test
    public void testDrawGood() {
        System.out.println("draw good");
        Deck deck = new Deck();
        Human instance = new Human();
        assertEquals(instance.getHand().getCards().size(), 0);
        instance.draw(deck);
        assertEquals(instance.getHand().getCards().size(), 1);
    }
    @Test
    public void testDrawBad() {
        System.out.println("draw bad");
        Deck deck = new Deck();
        Human instance = new Human();
        assertEquals(instance.getHand().getCards().size(), 0);
        try {
            for(int i = 0; i<53; i++){
                instance.draw(deck);
            }
            fail("Shouldn't be able to draw more than 52 cards");
        } catch (Exception e){}
    }
    @Test
    public void testDrawBoundary() {
        System.out.println("draw boundary");
        Deck deck = new Deck();
        Human instance = new Human();
        assertEquals(instance.getHand().getCards().size(), 0);
    }

    /**
     * Test of isBust method, of class Player.
     */
    @Test
    public void testIsBustGood() {
        System.out.println("isBust good");
        Human player = new Human();
        player.getHand().addCard(new StandardCard("Heart", "3"));
        assertEquals(false, player.isBust());
    }
    @Test
    public void testIsBustBoundary() {
        System.out.println("isBust boundary");
        Human player = new Human();
        for(int i = 0; i<7; i++){
            player.getHand().addCard(new StandardCard("Heart", "3"));
        }
        assertEquals(false, player.isBust());
    }
    @Test
    public void testIsBustBad() {
        System.out.println("isBust bad");
        Human player = new Human();
        for(int i = 0; i<7; i++){
            player.getHand().addCard(new StandardCard("Heart", "4"));
        }
        assertEquals(true, player.isBust());
    }

    public class PlayerImpl extends Player {

        public PlayerImpl() {
            super("");
        }

        @Override
        public void play() {}
    }
    
}
