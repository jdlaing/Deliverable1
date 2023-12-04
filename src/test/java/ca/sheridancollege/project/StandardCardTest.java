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
public class StandardCardTest {
    
    /**
     * Test of toString method, of class StandardCard.
     */
    @Test
    public void testCardValueGood() {
        System.out.println("card value");
        StandardCard instance = new StandardCard("Heart", "1");
        assertEquals(instance.value, 1);
    }
    @Test
    public void testCardValueBoundary() {
        System.out.println("card value");
        StandardCard instance = new StandardCard("Heart", "Jack");
        assertEquals(instance.value, 10);
    }
    @Test
    public void testCardValueBad() {
        System.out.println("card value");
        try {
            StandardCard instance = new StandardCard("Heart", "Invalid");
        } catch (NumberFormatException e){}
    }
    
}
