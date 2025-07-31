import java.util.*;
public class MinItem {
    public static void main(String[] args) {
        

        int arr[]={1,4,7,88,44};
        System.out.println(minRange(arr, 3, 4));
    }
    //work on edge cases here, like array being null

    static int minRange(int[] arr,int start,int end){

        

        if(arr==null){
            return -1;
        }
        int minVal=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]<minVal){
                minVal = arr[i];
            }

        }
        return minVal;
    }
    //imagine that the arr is not empty
    static int min(int[] arr){
        int minVal=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minVal){
                minVal = arr[i];
            }

        }
        return minVal;
    

    }
    
}

    
