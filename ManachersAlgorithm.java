public class ManachersAlgorithm {
    
    private static String preprocess(String s) {
        StringBuilder sb = new StringBuilder("#");
        for (char c : s.toCharArray()) {
            sb.append(c).append("#");
        }
        return sb.toString();
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        String T = preprocess(s);
        int n = T.length();

       
        int[] P = new int[n];
        int C = 0, R = 0; 
        for (int i = 0; i < n; i++) {
        
            int mirror = 2 * C - i;

            if (i < R) {
                P[i] = Math.min(R - i, P[mirror]);
            }

            int a = i + (1 + P[i]);
            int b = i - (1 + P[i]);
            while (a < n && b >= 0 && T.charAt(a) == T.charAt(b)) {
                P[i]++;
                a++;
                b--;
            }

            if (i + P[i] > R) {
                C = i;
                R = i + P[i];
            }
        }
        int maxLen = 0, centerIndex = 0;
        for (int i = 0; i < n; i++) {
            if (P[i] > maxLen) {
                maxLen = P[i];
                centerIndex = i;
            }
        }
        int start = (centerIndex - maxLen) / 2; 
        return s.substring(start, start + maxLen);
    }

    // Driver code
    public static void main(String[] args) {
        String s = "babad";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(s));

        s = "cbbd";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(s));
    }
}
