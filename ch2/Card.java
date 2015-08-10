/**
 * Created by flower on 2015/7/29.
 */
import java.util.Random;
import javax.swing.*;


public class Card {

    protected String face;
    protected ImageIcon cardpic;
    protected String testcardpic;
    protected int value;
    protected String suit;
    /***********************************************************
     Draws the shape.
     @param x the image of the card
     @param val the value of the card
     @param s the suit of the card
     @param f the type of the card
     ***********************************************************/
    public Card(String x, int val, String s, String f)
    {
        testcardpic = x;
        value = val;
        face = f;
        suit = s;
    }

    public String toString()
    {
        return "Face: "+ face + " Value: "+ value+" Suit:"+ suit +"~~~" +"Name:"+testcardpic;
    }


}
