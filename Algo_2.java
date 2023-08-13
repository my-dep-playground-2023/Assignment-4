public class Algo_2 {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23} ;
        int x=nums[0];
        int y=nums[0];
        
        for (int i=0;i<nums.length-1;i++){
     
            if (x<nums[i+1]){
                x=nums[i+1];       
            }
            if (y>nums[i+1]){
                y=nums[i+1];   
            }
        }
         System.out.println("LARGEST NUMBER OF THE SET: "+x+"            SMALLEST NUMBER OF THE SET "+y);
    }
    
}
