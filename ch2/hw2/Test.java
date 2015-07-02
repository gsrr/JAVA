public class Test
{
        public static void main(String args[])
        {
                Deck d = new Deck();
                for(int i = 0 ; i < 52 ; i++)
                {
                        Card c = d.getCard();
                        System.out.println(c.toString());
                }

        }
}
