public class Leetcode1295 {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums)); 
        System.out.println(digits(0)); 
        // Output should be 2
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits2(int num){
        if(num<0){
            num*=(-1);
        }
        return (int)(Math.log10(num))+1;
    }

    static int digits(int num){
        if(num<0){
            num*=(-1);
        }
        if (num == 0) return 1;  // handle zero correctly
        int ct = 0;
        while(num > 0){
            ct++;
            num /= 10;
        }
        return ct;
    }
}