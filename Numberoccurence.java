import java.util.Scanner;

public class Numberoccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1385757879;
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==7){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
    
}
