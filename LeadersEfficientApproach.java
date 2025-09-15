import java.util.Scanner;
public class LeadersEfficientApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array :");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findLeaders(arr,n);
    }
    static void findLeaders(int[] arr, int n){
        int rightMaximum=arr[n-1];
        System.out.println(rightMaximum + " ");
        for(int i=n-2;i>=0;i--){
            if(arr[i]>rightMaximum){
                rightMaximum=arr[i];
                System.out.println(rightMaximum + " ");

            }
        }
    } 
    
}
