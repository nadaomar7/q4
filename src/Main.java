import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("boy.text");
        Scanner output = new Scanner(file);
        String copy = "";
        while(output.hasNextLine())
        {
            String tocopy = "";
            tocopy = output.next();
            if(output.next("John") != null)
            {
                break;
            }
            else
            {
                copy =output.next();
                    System.out.println(copy);
            }

        }
        output.close();
    }
}