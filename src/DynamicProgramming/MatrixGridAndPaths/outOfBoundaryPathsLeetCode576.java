package DynamicProgramming.MatrixGridAndPaths;
import java.util.*;

public class outOfBoundaryPathsLeetCode576 {

    final static int mod = 1000000007;
    static int[][][] dp;

    public static int FP(int i, int j, int m, int n, int maxMoves) {
        // base
        if(i >= m || i < 0 || j >= n || j < 0) {
            return 1;
        }
        if(maxMoves <= 0) {
            return 0;
        }
        // dp
        if(dp[i][j][maxMoves] != -1) {
            return dp[i][j][maxMoves];
        }
        // task
        long right = FP(i, j+1, m, n, maxMoves-1);
        long left = FP(i, j-1, m, n, maxMoves-1);
        long up = FP(i-1, j, m, n, maxMoves-1);
        long down = FP(i+1, j, m, n, maxMoves-1);

        return dp[i][j][maxMoves] = (int) ((right + left + up + down) % mod);
    }
    public static int findPaths(int m, int n, int maxMoves, int row, int col) {
        dp = new int[m][n][maxMoves+1];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<=maxMoves; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return FP(row, col, m, n, maxMoves);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int m = in.nextInt();
        System.out.println("Enter the columns: ");
        int n = in.nextInt();
        System.out.println("Enter the maximum moves: ");
        int maxMoves = in.nextInt();
        System.out.println("Enter the Start row and Start column: ");
        int row = in.nextInt(); int col = in.nextInt();

        System.out.println(findPaths(m, n, maxMoves, row, col));
    }
}
