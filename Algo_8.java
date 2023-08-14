import java.util.Arrays;

public class Algo_8 {
    public static void main(String[] args) {  
    int[] numA = {5, 7, -2, 3, 4, 6, -8};
   int[] numB = {7, 8, -8, 2, 1, -9, 6};

   //REMOVING DUPLICATES
   
   int[] numC=new int[numA.length+numB.length];

//    1. numA ∩ numB--------------------------------------------------------
   String equNumbers="";
   System.out.print("1. numA ∩ numB  ");
   for (int i=0;i<numA.length;i++){
    for(int j=0;j<numB.length;j++){
        if(numA[i]==numB[j]){
            equNumbers+=numA[i];
            System.out.print(numA[i]);
            System.out.print(" ,");

            continue;
        }
    }
    
   }System.out.print("\b");
   
        // System.out.println("1. numA ∩ numB  "+equNumbers);  
        
        // char[] chars=equNumbers.toCharArray();
        // System.out.println(Arrays.toString(chars));
}}

// 2. numA ∪ numB-------------------------------------------------------------

