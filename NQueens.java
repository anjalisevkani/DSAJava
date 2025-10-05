import java.util.*;
import java.util.Arrays;

public class NQueens {
    static List<List<String>> res = new ArrayList<>();
    static boolean[] cols, diag1, diag2;

    public static List<List<String>> solveNQueens(int n) {
        cols = new boolean[n];        // column usage
        diag1 = new boolean[2*n];     // r - c diagonal
        diag2 = new boolean[2*n];     // r + c diagonal
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');

        backtrack(0, n, board);
        return res;
    }

    private static void backtrack(int row, int n, char[][] board) {
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (char[] r : board) solution.add(new String(r));
            res.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (cols[col] || diag1[row - col + n] || diag2[row + col]) continue;

            board[row][col] = 'Q';
            cols[col] = diag1[row - col + n] = diag2[row + col] = true;

            backtrack(row + 1, n, board);

            board[row][col] = '.';
            cols[col] = diag1[row - col + n] = diag2[row + col] = false;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);
        for (List<String> sol : solutions) {
            for (String row : sol) System.out.println(row);
            System.out.println();
        }
    }
}