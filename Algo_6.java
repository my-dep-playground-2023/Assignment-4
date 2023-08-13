import java.util.Arrays;
import java.util.Scanner;

public class Algo_6 {
    private static final Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        String inputSentence ;
        char[]chars;
        do{
        System.out.println("ENTER A SENTENCE: ");
           inputSentence=scanner.nextLine();
            }while(inputSentence.isEmpty());
            chars=inputSentence.toCharArray();
            int count=0;
            String words="";
            String [] words2=new String[chars.length];
            int j=0; 
   
            for (int i=0;i<chars.length-1;i++){   
                words+=chars[i];
           
                if (chars[i]==' ' && chars[i+1]!=' ') {
                    count++;
                   
                    words2[j]=words;
                    j++;
                  
                    words="";
                   
                }

        }
      words+=chars[chars.length-1];
      words2[count]=words;
       j=count;

    for (int i=0;i<count+1;i++){
        String initialStrings= words2[i];
        words2[i]=words2[j];
        words2[j]=initialStrings;
        j--;
        if ((count-1)/2==i) break;

    }

    words="";
    for(int i=0;i<count+1;i++){
        words+=words2[i]+" ";
    }
     
    
        System.out.println(words);

       
        
    }
    
}
