import java.util.Scanner;
public class LongestsubarrayWithOnesAfterReplacement{
    public static void main(String[] args) {
        int[] arr={1,1,1,1,0,0,0,1,1,1,1,1,0};
        int k=1;
        int result= findmaxConsecutiveOnes(arr, k);
        System.out.println("Length of longest contiguous subarray containing only 1s after replacement = " + result);
    }
    private static int findmaxConsecutiveOnes(int[] arr, int k){
        if(arr==null|| arr.length==0){
            return 0;
        }
        int maxOnes=0;
        int numReplacements=0;
        int windowStart=0;
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
            if(arr[windowEnd]==0){
                numReplacements++;
            }
            while(numReplacements>k){
                if(arr[windowStart]==0){
                    numReplacements--;
                }
                windowStart++;
            }
            maxOnes= Math.max(maxOnes,windowEnd-windowStart+1);
        }
        return maxOnes;

    }
    
}
