package DynamicProgramming.UniquePaths;
import java.util.Scanner;

public class uniquePathsLeetCode62 {
    public static class Solution {
        public static int uniquePath(int m, int n) {
            int[][] dp = new int[2][n];
            for(int i=0; i<n; i++) {
                dp[0][i] = 1;
            }
            dp[1][0] = 1;
            for(int i=1; i<m; i++) {
                for(int j=1; j<n; j++) {
                    dp[1][j] = dp[0][j] + dp[1][j-1];
                }
                dp[0] = dp[1];
            }
            return dp[1][n-1];
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.printf("The total number of unique paths is: %d", Solution.uniquePath(m, n));
    }
}
