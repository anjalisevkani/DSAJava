//Ceiling of a number is the smallest element greater than or equal to the target
public class Ceiling {
    public static void main(String[] args){
        int[] arr={2,3,5,9,14,16,18};
        int target= 19;
        int ans= ceiling(arr,target);
        System.out.println(ans);

    }

    //return the index
    //return -1 if it does not exist
    static int ceiling(int[] arr, int  target){
        int start =0;
        int end= arr.length-1;
        while(start<=end){
            //find the middle element
            //int mid= (start + end)/2;
            //might be possible (start+end) exceeds the range of integer in java
            int mid = start + (end-start)/2;
            //but what if if the target is greater than the greatest number in the array
            if(target>arr[arr.length-1]){
                return -1;
            }

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
    
}
