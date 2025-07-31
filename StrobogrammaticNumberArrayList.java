/*import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StrobogrammaticNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        if (isStrobogrammatic(num)) {
            System.out.println(num + " is a strobogrammatic number.");
        } else {
            System.out.println(num + " is not a strobogrammatic number.");
        }
    }

    public static boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char l = num.charAt(left);
            char r = num.charAt(right);

            if (!map.containsKey(l) || map.get(l) != r) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}*/

import java.util.ArrayList;
import java.util.Scanner;

public class StrobogrammaticNumberArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        if (isStrobogrammatic(num)) {
            System.out.println(num + " is a strobogrammatic number.");
        } else {
            System.out.println(num + " is not a strobogrammatic number.");
        }
    }

    public static boolean isStrobogrammatic(String num) {
        ArrayList<Character> digits = new ArrayList<>();
        for (int i = 0; i < num.length(); i++) {
            digits.add(num.charAt(i));
        }

        int left = 0;
        int right = digits.size() - 1;

        while (left <= right) {
            char l = digits.get(left);
            char r = digits.get(right);

            if (!isValidPair(l, r)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Valid strobogrammatic digit pairs
    public static boolean isValidPair(char l, char r) {
        return (l == '0' && r == '0') ||
               (l == '1' && r == '1') ||
               (l == '8' && r == '8') ||
               (l == '6' && r == '9') ||
               (l == '9' && r == '6');
    }
}


