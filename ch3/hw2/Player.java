//************************************************************
//
//  Hand.Java             Authors:  Lewis, Chase, Coleman
//  
//  Provides an implementation of a hand of cards using a 
//  set to represent the cards
//
//************************************************************

import java.util.*;

public class Player
{
        protected ArrayList<Card> card_in_hand;

        public Player()
        {
                //...
        }

        public void receive_card(Deck currentdeck)
        {
                //...
        }

        public int cal_hand_value()
        {
                int handvalue = 0;
                //...
                return handvalue;
        }


        public String toString()
        {
                String result="";

                Card cardstr = null;
                int i=0;
                Iterator<Card> scan = card_in_hand.iterator();
                while (scan.hasNext())
                {
                        cardstr= scan.next();
                        result += "card"+i+": "+cardstr.getvalue()+"\n";
                        i++;
                }

                return result;
        }

}//end Player
