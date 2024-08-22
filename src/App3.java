import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App3 {
    public static void main(String[] args) throws IOException{
        try{
            BufferedReader b_read = new BufferedReader(new FileReader("test3.txt"));

            String i;

            while((i=b_read.readLine()) != null){
                StringBuilder str = new StringBuilder(i);

                int flag = 0;

                if(str.charAt(0) >= 'i' && str.charAt(0) <='n'){
                    flag = 1;
                    if (str.charAt(1) >= 'I' && str.charAt(1) <= 'N') {
                        for(int j=2; j<= (str.length() -1) ; j++ ){
                            if (!(str.charAt(j) >= '0' && str.charAt(j) <= '9')) {
                                flag = 0;
                            }
                        }
                    }
                    else{
                        flag =0;
                    }
                }

                else if (str.charAt(0) == '0') {
                    flag=2;
                    if(str.charAt(1) == '.'){
                       
                        for(int j=2; j<= (str.length() -1) ; j++ ){
                            if (!(str.charAt(j) >= '0' && str.charAt(j) <= '9')) {
                                 flag = 0;
                            }
                        }
                       
                    }

                    else{
                        flag=0;
                    }
                }

                else{
                    flag =0;
                }

                switch (flag) {
                    case 1 ->System.out.println("integer");

                    case 2 -> System.out.println("float");

                    default -> System.out.println("default");
                }
            }

            b_read.close();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
