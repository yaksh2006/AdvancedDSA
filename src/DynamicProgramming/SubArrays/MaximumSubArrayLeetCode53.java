package DynamicProgramming.SubArrays;
import java.util.Scanner;

public class MaximumSubArrayLeetCode53 {
    public static class Solution {
        public static int MS(int[] num) {
            int[] dp = new int[num.length];
            dp[0] = num[0];
            int max = num[0];
            for(int i=1; i<dp.length; i++) {
                dp[i] = Math.max(dp[i-1] + num[i], num[i]);
                max = Math.max(max, dp[i]);
            }
            return max;
        }
        public static int maximumSubarray(int[] num) {
            return MS(num);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = in.nextInt();
        System.out.println("Enter the array: ");
        int[] num = new int[n];
        for(int i=0; i<n; i++) {
            num[i] = in.nextInt();
        }
        System.out.printf("The maximum sum of subarray is %d", Solution.maximumSubarray(num));
    }
}
