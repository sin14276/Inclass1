package exercise1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author Sukhdeep
 * @author Paul Bonenfant May 2020
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13
   
       public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    Card() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }



    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }  
}