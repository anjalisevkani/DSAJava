import java.util.Scanner;
public class SimpleSieve{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        boolean[] prime= new boolean[n+1];
        for(int i=0;i<=n;i++){
            prime[i]= true;
        }
        for(int p=2;p*p<=n;p++){
            if(prime[p]==true){
                for(int i=p*p;i<=n;i=i+p){
                    prime[i]=false;
                }

            }
        }
        int count=0;
        for(int p=2;p<=n;p++){
            if(prime[p]){
                count++;
            }
        }
        System.out.println("No. of Prime numbers= "+ count);
        int[] res = new int[count];
        int index=0;
        int c=0;
        for(int p=2;p<=n;p++){
            if(prime[p]){
                res[index++]=p;
                c++;
            }
        }
        System.out.println("No.of prime numers between range " + c);
        for(int i=0;i<count;i++){
            if(res[i]==0){
                break;
            }
            System.out.println(res[i]+" ");

        }
    }
}