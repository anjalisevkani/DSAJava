import java.util.ArrayList;
import java.util.Arrays;

public class Strobo {
    public static void main(String[] args){
        int n = 3;
        ArrayList<String> result = StrobogrammaticNum(n);
        System.out.println("All Strobogrammatic numbers of length " + n + ":");
        System.out.println(result);
    }

    public static ArrayList<String> StrobogrammaticNum(int n){
        return numDef(n, n);
    }

    public static ArrayList<String> numDef(int n, int length){
        if(n == 0){
            // base case: return list with empty string
            return new ArrayList<String>(Arrays.asList(""));
        }
        if(n == 1){
            // base case: middle digit can only be 0, 1, or 8
            return new ArrayList<String>(Arrays.asList("0", "1", "8"));
        }

        ArrayList<String> middles = numDef(n - 2, length);
        ArrayList<String> result = new ArrayList<String>();

        for(String middle: middles){
            if(n != length){
                result.add("0" + middle + "0");
            }
            result.add("1" + middle + "1");
            result.add("6" + middle + "9");
            result.add("8" + middle + "8");
            result.add("9" + middle + "6");
        }

        return result;
    }
}
