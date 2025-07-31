public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={23,45,67,89,65,43,21};
        int target=89;
        boolean ans= linearSearch3(nums, target);
        System.out.println(ans);
    }

    //search the target and return the element
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length==0){
            return false;
        }

        //run a for loop
        for(int element: arr){
            if(element==target){
                return true;
            }
        }
        return false;
    }

    //search the target and return the element
    static int linearSearch2(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        //run a for loop
        for(int index=0;index<arr.length;index++){
            //check for element at every index
            int element = arr[index];
            if(element==target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        //run a for loop
        for(int index=0;index<arr.length;index++){
            //check for element at every index
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hene the target not found
        return -1;
    }
    
}
