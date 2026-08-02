package DynamicProgramming.GameTheory;

import java.util.Scanner;

public class predictWinnerLeetCode486 {
    public static int PW(int[] num, int left, int right, int[][] dp) {
        // base
        if(left == right) {
            return num[left];
        }
        // dp
        if(dp[left][right] != -1) {
            return dp[left][right];
        }
        // task
        int takeLeft = num[left] - PW(num, left + 1, right, dp);
        int takeRight = num[right] - PW(num, left, right-1, dp);

        return dp[left][right] = Math.max(takeLeft, takeRight);
    }
    public static boolean predictWin(int[] num, int[][] dp) {
        return PW(num, 0, num.length-1, dp) >= 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int n = in.nextInt();
        int[] num = new int[n];
        ArrayInput.input(num);
        int[][] dp = new int[num.length][num.length];
        ArrayInput.dpTwoDimFill(dp);
        System.out.println(predictWin(num, dp));
    }
}
