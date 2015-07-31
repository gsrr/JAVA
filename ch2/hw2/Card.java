//************************************************************
//
//  Card.java             Authors:  Lewis, Chase, Coleman
//
//  Provides an implementation of a class to represent a
//  playing card
//
//************************************************************

import java.util.Random;
import javax.swing.*;


public class Card {

  protected String face;
  protected ImageIcon cardpic;
  protected int value; 
  protected String suit;

  /***********************************************************
     Draws the shape.
     @param x the image of the card
     @param val the value of the card
     @param s the suit of the card
     @param f the type of the card
  ***********************************************************/
  public Card(ImageIcon x, int val, String s, String f)
  {
    cardpic = x;
    value = val;  
    face = f;
    suit = s;
  }


  public String toString()
  {
    return "Face: "+ face + " Suit"+ suit +" Value: "+ value;
  }

}//end Card
