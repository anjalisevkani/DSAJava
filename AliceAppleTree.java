import java.util.*;
public class AliceAppleTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of apples to be collected: ");
        int M = sc.nextInt();
        System.out.println("Enter no. of apples in each tree: ");
        int K = sc.nextInt();
        System.out.println("Enter no. of trees in north: ");
        int N =sc.nextInt();
        System.out.println("Enter no. of trees in south: ");
        int S =sc.nextInt();
        System.out.println("Enter no. of trees in east: ");
        int E =sc.nextInt();
        System.out.println("Enter no. of trees in west: ");
        int W =sc.nextInt();
        int ans= minApples(M, K, N, S, E, W);
        System.out.println("Minimum apples to guarantee: "+ ans);
    }
    static int minApples(int M,int K,int N,int S,int E,int W){
        if(M<=S*K){
            return M;
        }else if(M<= S*K + (E+W)){
            return S*K + (M-S*K)*K;
        }else{
            return -1;
        }
        
    }
}
