import java.io.*;
import java.util.*;

public class Test
{
        public static void main(String args[])
        {                       
                try
                {
                        //declare ArrayList & Array
                        Reader r = new Reader();
                        String line;
                        while((line = r.readLine()) != null)
                        {
                                System.out.println(line);
                                // Store data to ArrayList and Array
                        }
                }
                catch(IOException e)
                {

                }
        }

        public static void printArrList()
        {
        }

        public static void printArr()
        {
        }
}
