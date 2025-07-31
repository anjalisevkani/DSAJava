public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={23,65,78,54,44,33};
        
        int target=78;
        int ans= linearSearch(arr, target, 1, 4);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target,int start, int end){
        if(arr.length==0){
            return -1;
        }
        
        
        for(int i=start;i<=end;i++){
            int element= arr[i];
            if(element==target){
                return i;
            }

        }
        return -1;

    }
    
}
