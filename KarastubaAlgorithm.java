import java.util.*;
public class KarastubaAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        long x = sc.nextLong();
        System.out.println("Enter number2: ");
        long y = sc.nextLong();
        long product = karastuba(x,y);
        System.out.println(x + "*"+y +"= "+product);

    }
    static long karastuba(long x,long y){
        if(x<10||y<10){
            return x*y;
        }
        int m = Math.max(getNumDigits(x),getNumDigits(y));
        int halfM=m/2;
        long powerOf10= pow10(halfM);
        long a = x/powerOf10;
        long b = x%powerOf10;
        long c = y/powerOf10;
        long d = y%powerOf10;

        long ac = karastuba(a,c);
        long bd= karastuba(b,d);
        long abcd= karastuba(a+b,c+d);

        return ac*pow10(2*halfM) + (abcd-ac-bd)*powerOf10 + bd;
    }
    static int getNumDigits(long x){
        if(x==0){
            return 1;
        }
        int count=0;
        while(x>0){
            count++;
            x/=10;
        }
        return count;
    }
    static long pow10(int exp){
        long result=1;
        for(int i=0;i<exp;i++){
            result*=10;
        }
        return result;
    }
    
}
