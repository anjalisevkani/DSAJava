// Floor of a number is the greatest number which is smallest or equal to target
public class Floor {
    public static void main(String[] args){
        int[] arr={2,3,5,9,14,16,18};
        int target= 1;
        int ans= floor(arr,target);
        System.out.println(ans);

    }

    //return the index
    //return -1 if it does not exist
    static int floor(int[] arr, int  target){
        int start =0;
        int end= arr.length-1;
        while(start<=end){
            //find the middle element
            //int mid= (start + end)/2;
            //might be possible (start+end) exceeds the range of integer in java
            int mid = start + (end-start)/2;

            //but what if the target is smaller than the smallest element in the array
            if(target<arr[0]){
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
        return end;
    }
    
}
