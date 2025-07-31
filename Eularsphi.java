import java.util.Scanner;

public class Eularsphi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int count =0;
        for(int i=1;i<=num;i++){
            if(GCD(i,num)==1){
                count++;
            }
        }
        System.out.println("Euler's totient function (" + num +") = " + count);
    }
        static int GCD(int a,int b){
            if(a==0){
                return b;
            }
            return GCD(b%a,a);
        }
        sc.close();
}
    
