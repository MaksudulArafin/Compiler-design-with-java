import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
    public static void main(String[] args) throws IOException{
        try {
             FileReader fin = new FileReader("test2.txt");
            BufferedReader bin = new BufferedReader(fin);

            String i;
            while ((i=bin.readLine()) != null ) {
    
                String str1 = "CSE 1111";
                String str2 = "CSE 1112";
                String str3 = "CSE 1121";
                String str4 = "CSE 1122";

                if(str1.equals(i) == true){
                    System.out.println(str1 +" -> Fundamental.");
                }

                else if (str2.equals(i) == true) {
                    System.out.println(str2 + " -> Fundamental Lab.");

                }

                else if (str3.equals(i) == true) {
                    System.out.println(str3 +" -> Programming.");

                }

                else if (str4.equals(i) == true) {
                    System.out.println(str4 + " -> Progamming Lab.");

                }




            }
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
