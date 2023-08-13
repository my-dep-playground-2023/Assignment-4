import java.util.Arrays;

public class Algo_4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            k=nums[i];
            nums[i]=nums[(nums.length-1)-j];
            nums[(nums.length-1)-j]=k;

            j++;
            if (i==(nums.length/2)) break;
        }
        System.out.println(Arrays.toString(nums));
    }
}
