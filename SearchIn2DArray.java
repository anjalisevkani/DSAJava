public class SearchIn2DArray{
    public static void main(String[] args) {
        int[][] arr={
            {23,45,67},
            {34,56,43,65},
            {55,44,33,22},
            {34,56}
        };
        /*int target= 66;
        int[] ans= search(arr,target);  //format of return value {row,col}
        System.out.println(Arrays.toString(ans));*/
        int ans= max(arr);
        System.out.println(ans);
    }

    static int[] search(int[][] arr, int target){
        for(int row=0; row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};


    }

    static int max(int[][] arr){
        int max= Integer.MIN_VALUE;
        for(int row=0; row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max= arr[row][col];
                }
            }
        }
        return max;


    }
}