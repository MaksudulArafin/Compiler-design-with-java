
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ASCII {
    public static void main(String[] args) throws IOException{
      try {
          BufferedReader b_in = new BufferedReader(new FileReader("test4.txt"));

          String str;
          while((str=b_in.readLine()) != null){
            str = str.trim();
              if(isKeyword(str)) {
                  System.out.println("Keyword.");
              }

              else if (isNumber(str)) {
                System.out.println("Constant.");
              }

              else if (isIdentifier(str)) {
                System.out.println("Identifier.");
              }

              else{
                System.out.println("Undefined.");
              }

          }
          b_in.close();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }

    private static boolean isIdentifier(String str) {
      if (str.charAt(0)=='$' || str.charAt(0)=='_' || str.charAt(0)>=65 && str.charAt(0)<=90 || str.charAt(0)>=97 && str.charAt(0)<=122) {
        for(int i=1; i<str.length(); i++){
          if(!(str.charAt(i) == ' ' || str.charAt(i) == '$' || str.charAt(0)=='_' || str.charAt(0)>=65 && str.charAt(0)<=90 || str.charAt(0)>=97 && str.charAt(0)<=122 || str.charAt(0)>=49 && str.charAt(0)<=57)){
            return false;
          }
        }
        return  true;
      }
      return false;
    }

    //for Keyword
    private static boolean isKeyword(String str) {
      str = str.trim();
      String[] i = {"auto", "double", "int", "struct",
      "break", "else", "long", "switch",
      "case", "enum", "register", "typedef",
      "char", "extern", "return", "union",
      "const", "float", "short", "unsigned",
      "continue", "for", "signed", "void",
      "default", "goto", "sizeof", "volatile",
      "do", "if", "static", "while"} ;

        for (String i1 : i) {
            if (str.equals(i1)) {
              return true;
            }
        }
        return false;
    }

    private static boolean isNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
          if (str.charAt(i) == '.') {
          }
          else if(!(Character.isDigit(str.charAt(i)))){
              return false;
          }
        }
        return true;
    }



}
