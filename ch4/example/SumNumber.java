public class SumNumber
{

        public double sum(int a, int b)
        {
                return a + b;
        }
        public int sum(int a, int b)
        {
                return a + b;
        }

        public static void main(String args[])
        {
                SumNumber an = new SumNumber();
                System.out.println(an.sum(3,5));
                System.out.println(an.sum(3.3,5.3));
        }
}
