package DynamicProgramming.MatrixGridAndPaths;
import java.util.Scanner;
public class PascalsTriangle2LeetCode119 {
    public static class Solution {
        public static int[] pascal(int rowIndex) {
            int[][] dp = new int[2][rowIndex + 1];
            dp[0][0] = 1;
            dp[1][0] = 1;
            for (int i = 1; i < rowIndex + 1; i++) {
                for (int j = 1; j < rowIndex + 1; j++) {
                    dp[1][j] = dp[0][j] + dp[0][j - 1];
                }
                dp[0] = dp[1].clone();
            }
            return dp[1];
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row index: ");
        int rowIndex = in.nextInt();
        int[] ans = Solution.pascal(rowIndex);
        for(int i: ans) {
            System.out.print(i + " ");
        }
    }
}
