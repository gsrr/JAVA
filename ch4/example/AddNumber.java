public class AddNumber
{

        public double add(double a, double b)
        {
                return a + b;
        }
        public int add(int a, int b)
        {
                return a + b;
        }

        public static void main(String args[])
        {
                AddNumber an = new AddNumber();
                System.out.println(an.add(3,5));
                System.out.println(an.add(3.3,5.3));
        }
}
