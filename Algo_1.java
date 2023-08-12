import java.util.Scanner;

public class Algo_1{
    private static final Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

        do{
            System.out.println("ENTER A NUMBER");
            int num=scanner.nextInt();
            scanner.nextLine();
            if (num<0 ){
                System.out.println("PLEASE ENTER A POSITIVE NUMBER");
            }
           
            int x=0;
            int y=1;
            int z=0;
            int k=0;
            String fibo=y+",";
            for(int i=1;i<num/2;i++){
               z=x+y;
               fibo+=z+" ,";
               k=y+z;
               fibo+=k+" ,";
               x=z;
               y=k;
             
            }
            System.out.print(fibo+"\b");

        }while(true);
        
    }

    
}