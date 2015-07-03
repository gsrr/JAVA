//************************************************************
//
//  Deck.Java             Authors:  Lewis, Chase, Coleman
//  
//  Provides an implementation of a deck of cards using a 
//  set to represent the cards
//
//************************************************************


import java.util.*;
import javax.swing.*;
import java.awt.*;


public class Deck 
{

  ArrayList<Card> deckSet = new ArrayList<Card>();  

  /**********************************************************
     Constructs a deck of 52 Cards and 
      puts them in the set.
  **********************************************************/
  public Deck() 
  {
    ImageIcon card1 = new ImageIcon("aces.jpg");
    Card aces = new Card(card1, 1, "spade", "Ace");

    ImageIcon card2 = new ImageIcon("aceh.jpg");
    Card aceh = new Card(card2, 1, "heart", "Ace");

    ImageIcon card3 = new ImageIcon("aced.jpg");
    Card aced = new Card(card3, 1,"diamond", "Ace");

    ImageIcon card4 = new ImageIcon("acec.jpg");
    Card acec = new Card(card4, 1,"club", "Ace");

  
    deckSet.add(aces);
    deckSet.add(aceh);
    deckSet.add(aced);
    deckSet.add(acec);
        
    //... finish remind codes

  }
  /**********************************************************
     returns a single random Card from the deck
  **********************************************************/

  public static int getRandomNumber(int n)
  {
          //...

  }

  public Card getCard()
  {
        int n = getRandomNumber(//...);
        //...
  }

}//end deck










