import java.util.*;
public class Strobo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        String num = sc.nextLine();
        if(strobogrammaticNum(num)){
            System.out.println(num + " is a strobogrammatic number.");
        }else{
            System.out.println(num + " is not a strobogrammatic number.");
        }
    }
    public static boolean strobogrammaticNum(String num){
        Map<Character,Character> stroboDictionary = new HashMap<>();
        stroboDictionary.put('0','0');
        stroboDictionary.put('1','1');
        stroboDictionary.put('6','9');
        stroboDictionary.put('8','8');
        stroboDictionary.put('9','6');
        
        int n= num.length();
        for(int i = 0,j=(n-1);i<=j;i++,j--){
            char left_digit= num.charAt(i);
            char right_digit= num.charAt(j);
            char mapping= stroboDictionary.getOrDefault(left_digit,'-');
            if(mapping=='-'){
                return false;
            }
            if(mapping!=right_digit){
                return false;
            }
            

        }
        return true;
    }
    
}
