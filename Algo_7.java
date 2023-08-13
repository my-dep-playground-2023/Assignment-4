import java.util.Arrays;
import java.util.Scanner;

public class Algo_7 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String input;
        do{
            System.out.println("ENTER A SENTENCE: ");
            input=scanner.nextLine();

        }while(input.isBlank());
        char[] chars=input.toCharArray();

        String words="";
        int count=0;
        int j=0;
        String[] wordArray=new String[chars.length];
        for (int i=0;i<chars.length-1;i++){
            words+=chars[i];
            
            if (chars[i]==' ' && chars[i+1]!=' '){
                count+=1;
               
                wordArray[j]=words;
                j++;
                words="";
            }       
        }
        words+=chars[chars.length-1];
        wordArray[j]=words;
       
        int x=0;
        int y=0;
        int z=0;
        int k=2;
        String longestWord="";
        String shortestWord="";
        for(int i=0;i<(count+1);i++){
            x=(wordArray[i].length());
            z=(wordArray[i].length());
            if (y<x){
                y=(wordArray[i].length());
                longestWord=wordArray[i];
            }

            if(k>z){
                k=(wordArray[i].length());
                shortestWord=wordArray[i];
            }


        }
        for(int i=0;i<(count+1);i++){
            if (y==wordArray[i].length()){
                longestWord+=wordArray[i]+" ";
            }
            if (k==wordArray[i].length()){
                shortestWord+=wordArray[i]+" ";
            }
        }
        System.out.println("Longest word: "+longestWord+" length "+(y-1));
        System.out.println("Shortest word: "+shortestWord+" length "+(k-1));

        
    }


    
}
