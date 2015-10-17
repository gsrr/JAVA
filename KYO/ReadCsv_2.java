import java.io.*;
import java.util.*;


/*
 * Java is a Orient-Object Programming language
 * What is class?
 *
 */
public class ReadCsv_2
{
        public static void main(String args[])
        {
                try 
                {
                        ArrayList<String[]> sol = new ArrayList<String[]>();
                        BufferedReader in = new BufferedReader(new FileReader("csv.example"));
                        String str;
                        while ((str = in.readLine()) != null) {
                                String[] arr = str.split(",");
                                sol.add(arr);
                        }
                        for(int i = 0 ; i < sol.size() ; i++)
                        {
                                for(int j = 0 ; j < sol.get(i).length; j++)
                                {
                                        System.out.println(sol.get(i)[j]);
                                }
                                System.out.println();
                        }
                }
                catch (IOException e) 
                {

                }
        }
}


