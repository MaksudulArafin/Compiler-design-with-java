import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class App1 {
     public static void main(String args[]) throws FileNotFoundException, IOException{

        try {
            FileInputStream fin = new FileInputStream("test1.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);


            int i=0,length=0,vowel=0,consonent=0,flag=0,total_word=0;


            System.out.println("The Sentence is = ");

            while((i=bin.read()) != -1){
                length++;
                if(i != ' ' && i != '.'){
                    if (i>=65 && i<=90 || i>=97  && i<=122 ) {
                        if(i=='a' || i=='e' || i=='i'  || i=='o' || i=='u' || i=='A' || i=='E' || i=='I' || i=='O' || i=='U' ){
                            vowel++;
                        }
                        else {
                            consonent++;
                        }

                        flag=1;
                    }
                    
                }
                else if ((i == ' ' || i == '.') && flag==1){
                    ++total_word ;
                    flag=0;
                }
                System.out.print((char)i);
            }
            System.out.println();

            System.out.println("\nLength : "+ length);
            System.out.println("Vowel : "+ vowel);
            System.out.println("Consonent : "+ consonent);
            System.out.println("Total Word : "+ total_word);
            System.out.println("After spliting the sentence:");

             //split the sentence in half
             BufferedReader b_read = new BufferedReader(new FileReader("test1.txt"));
             String str;
             int half = length/2;
             while((str = b_read.readLine()) != null){
                 String string=str;
                 
                 for(int j=half; j<=length; j++){
                     if(string.charAt(j) == ' '){
                         half = j;
                         break;
                     }
                 }
 
                 for(int j=0; j<length; j++ ){
                     System.out.print(string.charAt(j));
                     if(j==half-2){
                         System.out.println();
                     }
                 }
             }

            bin.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
