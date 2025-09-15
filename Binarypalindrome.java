import java.util.*;
public class Binarypalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        System.out.println(Palindrome(x));
    }
    static boolean Palindrome(int x){
        String s = Integer.toBinaryString(x);
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
