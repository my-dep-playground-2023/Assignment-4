
import java.util.Scanner;

public class Algo5 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String textInput;
        
        do{
            
              String invertText="";
            System.out.println("ENTER A TEXT: ");
             textInput=scanner.nextLine();
            char[] chars=textInput.toCharArray();
            for(int i=chars.length-1;i>=0;i--){
                invertText+=chars[i];

            }
            System.out.println(invertText);


        }while(textInput.isBlank());
    }
    
}
