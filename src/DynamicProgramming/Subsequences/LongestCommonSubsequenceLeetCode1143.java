package DynamicProgramming.Subsequences;
import java.util.Scanner;

class Solution {
    public int LCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1; i<m+1; i++) {
            for(int j=1; j<n+1; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
public class LongestCommonSubsequenceLeetCode1143 {
    public static int longestCommonSubsequence(String s1, String s2) {
        Solution obj = new Solution();
        return obj.LCS(s1, s2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String str1 = in.next();
        System.out.println("Enter the Second String: ");
        String str2 = in.next();
        System.out.printf("The Longest Common subsequence of two String is: %d", longestCommonSubsequence(str1, str2));
    }
}
