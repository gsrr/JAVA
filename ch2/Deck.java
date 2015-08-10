/**
 * Created by flower on 2015/7/29.
 */

import java.util.*;
import javax.swing.*;
import java.awt.*;


public class Deck {

    ArrayList<Card> deckSet = new ArrayList<Card>();



    /**********************************************************
     Constructs a deck of 52 Cards and
     puts them in the set.
     **********************************************************/
    public Deck()
    {
        ImageIcon[][] ImageIconarray = new ImageIcon[14][5];
        String[][] BB = new String[14][5];
        Card [][] CardName  =new Card[14][5];
        String[] suit={"spade","heart","diamond","club"};
        String[]Face={"G","A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for(int i =1;i<14 ;i++){


            for (int j=0;j<4;j++) {
                String CardNum = "card"+i+suit[j];
                //System.out.print(CardNum+"\n");
                BB[i][j]=CardNum;
                //System.out.print(BB[i][j]+"\n");
                //ImageIconarray[i][j]= new ImageIcon("XXX.jpg");
                CardName[i][j]= new Card(BB[i][j],i,suit[j],Face[i]);
                deckSet.add(CardName[i][j]);

            }



        }



    }
    /**********************************************************
     returns a single random Card from the deck
     **********************************************************/

    public static int getRandomNumber()
    {
        int i ;
        Random ran = new Random();
        i = ran.nextInt(51)+1;

        return i ;
    }


    public Card getCard()
    {
        int n = getRandomNumber();
        System.out.print(deckSet.get(n)+"\n");
        return deckSet.get(n);
    }

}
