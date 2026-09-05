package DynamicProgramming.Subsequences;
import java.util.Scanner;

public class LongestPalindromicSubSequenceLeetCode516 {
    public static class Solution {
        public static int LPS(String str1, String str2) {
            int[][] dp = new int[str1.length()+1][str2.length()+1];
            for(int i=1; i<dp.length; i++) {
                for(int j=1; j<dp[i].length; j++) {
                    if(str1.charAt(i-1) == str2.charAt(j-1)) {
                        dp[i][j] = 1 + dp[i-1][j-1];
                    } else {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    }
                }
            }
            return dp[str1.length()][str2.length()];
        }
    }
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = in.next();
        System.out.printf("The longest palindromic subsequence is: %d", Solution.LPS(str, reverse(str)));
    }
}
