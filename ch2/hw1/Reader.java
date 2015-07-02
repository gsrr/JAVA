import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;;


class Reader
{
        String line;
        static BufferedReader br;
        Reader() throws IOException
        {
                br = new BufferedReader(new FileReader("test.txt"));
        }

        public static String readLine() throws IOException
        {
                return br.readLine();


        }
        public static void close() throws IOException
        {
                br.close();
        }

}
