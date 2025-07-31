import java.util.Scanner;

public class MaxEquilibriumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size of array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxEquilibriumSum = Integer.MIN_VALUE;
        
        // Precompute prefix sums (left sum) and suffix sums (right sum)
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        leftSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + arr[i];
        }

        rightSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + arr[i];
        }

        // Find equilibrium index where left and right sums (excluding arr[i]) are equal
        for (int i = 0; i < n; i++) {
            int left = (i == 0) ? 0 : leftSum[i - 1];
            int right = (i == n - 1) ? 0 : rightSum[i + 1];

            if (left == right) {
                int equilibriumSum = left + arr[i] + right; // or 2*left + arr[i]
                maxEquilibriumSum = Math.max(maxEquilibriumSum, equilibriumSum);
            }
        }

        if (maxEquilibriumSum == Integer.MIN_VALUE) {
            System.out.println("No equilibrium index found.");
        } else {
            System.out.println("Maximum Equilibrium Sum: " + maxEquilibriumSum);
        }
    }
}