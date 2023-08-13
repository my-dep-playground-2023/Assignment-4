import java.util.Arrays;

public class Algo_3 {
    
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};
        int[] nums2=new int[nums.length];
        int j=0;
        for(int i=nums.length-1;i>=0;i--){
            nums2[j]=nums[i];
            j++;
        }
        nums=nums2;
        System.out.println(Arrays.toString(nums));
        

         
    

    }
}
