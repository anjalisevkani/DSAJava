import java.util.*;
public class NextBinarypalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        System.out.println("The next binary palindrome number after "+ n + " is "+ nextPalindrome(n));
    }
    static boolean isBinaryPalindrome(int n){
        String s = Integer.toBinaryString(n);
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static int nextPalindrome(int n){
        n++;
        while(!isBinaryPalindrome(n)){
            n++;
        }
        return n;
    }
    
}
