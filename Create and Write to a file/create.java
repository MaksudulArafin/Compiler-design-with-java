
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class create {
    public static void main(String[] args) throws IOException{
        
                    BufferedWriter bout  = new BufferedWriter(new FileWriter("test.txt"));

                    //Scanner sc = ;
                    String str = new Scanner(System.in).nextLine();
                   

                    bout.write(str);
                    bout.flush();
                    bout.close();
        
    }
}
