import java.util.Arrays;
import java.util.ArrayList;
public class LeadersBF {
    public static void main(String[] args) {
        int n=6;
        int[] arr={2,4,6,3,1,2};
        ArrayList<Integer> ans= printLeadersBF(arr, n);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+" ");
        }
    }
    public static ArrayList<Integer> printLeadersBF(int[] arr,int n){
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean leader= true;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    leader=false;
                    break;
                }
                
            }
            if(leader){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    
}
