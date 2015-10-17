import java.io.*;


/*
 * Java is a Orient-Object Programming language
 * What is class?
 *
 */
public class ReadCsv
{
        public static void main(String args[])
        {
                try 
                {
                        BufferedReader in = new BufferedReader(new FileReader("csv.example"));
                        String str;
                        while ((str = in.readLine()) != null) {
                                System.out.println(str);
                        }
                }
                catch (IOException e) 
                {

                }
        }
}


