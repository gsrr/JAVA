import java.io.*;
import java.util.*;

public class Test
{
        public static void main(String args[])
        {                       
                try
                {
                        Reader r = new Reader();
                        String line;
                        while((line = r.readLine()) != null)
                        {
                                System.out.println(line);
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
