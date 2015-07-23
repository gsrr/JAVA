import java.util.Scanner;

public class Poker
{


        public static void compare(Player[] p)
        {
                //...
        }

        public static void main(String args[])
        {
                Scanner kb = new Scanner(System.in);
                Deck d = new Deck();
                System.out.print("\nPlease enter the number of players:");       
                int players = kb.nextInt();
                Player[] p = new Player[players];
                //...
                compare(p);
        }
}
