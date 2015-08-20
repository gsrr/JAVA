/**
 * Created by flower on 2015/7/29.
 */
public class GAME {

    public static void main(String args[])
    {

        Deck d = new Deck();
        for(int i =1;i<52 ;i++) {

            System.out.print(d.deckSet.get(i) + "\n");
        }
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~"+ "\n");

       for(int i =1;i<10 ;i++) {

           d.getCard();
        }





    }

}
