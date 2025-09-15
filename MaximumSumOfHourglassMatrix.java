import java.util.*;
public class MaximumSumOfHourglassMatrix {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3,0,0},
            {0,0,0,0,0},
            {2,1,4,0,0},
            {0,0,0,0,0},
            {1,1,0,1,0}
        };
        System.out.println("Max sum of hourglass = "+ findMaxSum(matrix));
    }
    static int findMaxSum(int[][] matrix){
        int r= matrix.length;
        int c= (r==0)?0:matrix[0].length;
        if(r<3||c<3) throw new IllegalArgumentException("Matrix too small");
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<r-2;i++){
            for(int j=0;j<c-2;j++){
                int sum= (matrix[i][j] + matrix[i][j+1] + matrix[i][j+2])+(matrix[i+1][j+1]) +(matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2]);
                if(sum>maxSum){
                    maxSum=sum;
                }
            }

        }
        return maxSum;
    }
    
}
