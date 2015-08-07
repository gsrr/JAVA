public class Bicycle {

        private static int numberOfBicycles = 0;
        //private int numberOfBicycles = 0;
        public void rentBicycle()
        {
                //...
                if(numberOfBicycles >= 10)
                {
                        System.out.println("There is no bicycle.");
                        return;
                }
                numberOfBicycles++;
                System.out.println("The bicycle " + numberOfBicycles + " has been rent.");
        }

        public static void main(String args[])
        {
                Bicycle shop1 = new Bicycle();
                Bicycle shop2 = new Bicycle();
                for(int i = 0 ; i < 5 ; i++)
                {
                        shop1.rentBicycle();                                               
                }

                for(int i = 0 ; i < 6 ; i++)
                {
                        shop2.rentBicycle();                                               
                }
        }
}
