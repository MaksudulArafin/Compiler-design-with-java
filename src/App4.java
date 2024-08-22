import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App4 {
    public static void main(String[] args) throws IOException{
        try{
            BufferedReader b_in = new BufferedReader(new FileReader("test4.txt"));

            String i ;

            while((i=b_in.readLine()) != null){
                //StringBuilder str = new StringBuilder(i);
                i = i.trim();

                if (isKeyword(i)) {
                    System.out.println("\"" +i + "\"" + " is a Keyword.");
                }

                else if(isNumber(i)) {
                    System.out.println("\"" +i + "\""  + " is a Constant.");
                }

                else if (isIdentifier(i) ){
                    System.out.println("\"" +i + "\"" + "is Identifier.");
                }

                else {
                    System.out.println("\"" +i + "\"" + "is undefined.");
                }
            }

            b_in.close();
        
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    private static boolean isKeyword(String i){
        String[] str = {"auto", "double", "int", "struct",
                "break", "else", "long", "switch",
                "case", "enum", "register", "typedef",
                "char", "extern", "return", "union",
                "const", "float", "short", "unsigned",
                "continue", "for", "signed", "void",
                "default", "goto", "sizeof", "volatile",
                "do", "if", "static", "while"} ;

        for(int j=0 ; j<i.length(); j++){
            if( i.equals(str[j])){
                return true;
            }
            
        }
        return false;
    }

    private static boolean isNumber(String i) {
        {
            for (int j = 0; j < i.length(); j++) {
                if(i.charAt(j) == '.'){
                }
                else if (!Character.isDigit(i.charAt(j)))  {
                    return false;
                }
            }
            return true;
        }
    }

    private static boolean isIdentifier(String i){
        if(!(Character.isAlphabetic(i.charAt(0)) || i.charAt(0)=='_' || i.charAt(0)=='$')){
            return false;
        }
        for(int j=1; j<i.length(); j++){
            if (!(Character.isAlphabetic(i.charAt(j)) || Character.isDigit(i.charAt(j)) ||
            i.charAt(j)=='_' || i.charAt(j)==' ')) {
                return false;
            }
        }
        return true;
    }

}
