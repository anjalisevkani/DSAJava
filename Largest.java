import java.util.Scanner;
public class Largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // find the largest of 3 numbers

        /*int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }*/

        //another way
        /*int max = 0;
        if(a>b){
            max=b;

        }else{
            max=a;
        }
        if(c>max){
            max=c;
        }*/

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
        
    }
}
