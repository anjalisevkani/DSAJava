import java.util.Scanner;
public class Underscores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;

       
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '_') {
                count++;
            }
        }

        
        String result = "";
        for (int j = 0; j < count; j++) {
            result += "_";
        }
        for (int p = 0; p < s.length(); p++) {
            if (s.charAt(p) != '_') {
                result += s.charAt(p);
            }
        }

        System.out.println(result);
    }
}