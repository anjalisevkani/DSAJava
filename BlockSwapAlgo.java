import java.util.Arrays;
public class BlockSwapAlgo {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        int[] result = blockSwap(nums,k);
        System.out.println(java.util.Arrays.toString(result));
    }
    static int[] blockSwap(int[] nums,int k){
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        return nums;
    }
    static void reverse(int[] nums, int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        
    }

    
}
