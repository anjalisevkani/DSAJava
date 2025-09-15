public class MaxSubarrayProduct {
    public static void main(String[] args) {
        int[] arr={2,4,-2,3};
        int n= arr.length;
        System.out.println(maxSubarrayProduct(arr, n));

    }
    static double maxSubarrayProduct(int[] arr,int n){
        int maxProduct = Integer.MIN_VALUE;
        int prefix =1;
        int suffix=1;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;

            prefix= prefix*arr[i];
            suffix= suffix*arr[n-i-1];
            maxProduct = Math.max(maxProduct,Math.max(prefix,suffix));
        }
        return maxProduct;
    } 
    
}
