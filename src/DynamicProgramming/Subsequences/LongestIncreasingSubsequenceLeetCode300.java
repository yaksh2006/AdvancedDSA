package DynamicProgramming.Subsequences;

import java.util.*;

public class LongestIncreasingSubsequenceLeetCode300 {
    public static class Solution {
        public static int LIS(int[] num) {
            int[] dp = new int[num.length];
            int max = 0;
            for(int index=0; index<dp.length; index++) {
                for(int i=index; i>=0; i--) {
                    if(num[i] < num[index]) {
                        dp[index] = Math.max(dp[index], dp[i]);
                    }
                }
                dp[index] += 1;
                max = Math.max(max, dp[index]);
            }
            return max;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = in.nextInt();
        int[] num = new int[n];
        for(int i=0; i<n; i++) {
            num[i] = in.nextInt();
        }
        System.out.printf("The Length of Longest Increasing Subsequence is: %d", Solution.LIS(num));
    }
}
