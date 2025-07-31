public class OrderAgnosticBS{
    public static void main(String[] args){
        //int[] arr={-18, -12,56,43,23,67,87,98};
        int[] arr= {99,76,55,44,34};
        int target= 55;
        int ans= OrderAgnosticBS(arr,target);
        System.out.println(ans);


    }
    static int OrderAgnosticBS(int[] arr, int target){
        int start=0;
        int end= arr.length -1;

        //find whether the arr is sorted in ascending or descending
        boolean isAsc=arr[start]<arr[end];
        

        while(start<=end){
            //find the middle element
            //int mid= (start + end)/2;
            //might be possible (start+end) exceeds the range of integer in java
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }

            }else{
                if(target<arr[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }

            
        }
        return -1;
    }
}
    

