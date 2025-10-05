public class JosephusRecursive {
    // Recursive function
    static int josephus(int n, int k) {
        if (n == 1) return 0;  // base case (0-based index)
        return (josephus(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        int n = 7, k = 3;
        int survivor = josephus(n, k);
        System.out.println("Survivor (0-based): " + survivor);
        System.out.println("Survivor (1-based): " + (survivor + 1));
    }
}
