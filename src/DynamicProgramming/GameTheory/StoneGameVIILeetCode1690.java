package DynamicProgramming.GameTheory;
import java.util.*;

class Solution {
    public static int SG(int[] stone, int i, int j, int[][] dp) {
        //base
        if(i > j) return 0;
        // dp
        if(dp[i][j] != -1) return dp[i][j];
        //task
        int takeStartValue = 0;
        for(int k=i+1; k<=j; k++) takeStartValue += stone[k];

        int takeEndValue = 0;
        for(int k=j-1; k>=i; k--) takeEndValue += stone[k];

        int takeLeft = takeStartValue - SG(stone, i+1, j, dp);
        int takeRight = takeEndValue - SG(stone, i, j-1, dp);

        return dp[i][j] = Math.max(takeLeft, takeRight);
    }
}
public class StoneGameVIILeetCode1690 {
    public static int stoneGameVII(int[] stone) {
        int[][] dp = new int[stone.length][stone.length];
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return Solution.SG(stone, 0, stone.length-1, dp);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of stones: ");
        int n = in.nextInt();
        System.out.println("Enter the stone value in array: ");
        int[] stone = new int[n];
        for(int i=0; i<n; i++) {
            stone[i] = in.nextInt();
        }
        System.out.printf("The difference between two scores is: %d",stoneGameVII(stone));
    }
}
