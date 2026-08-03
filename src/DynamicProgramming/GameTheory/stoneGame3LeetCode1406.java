package DynamicProgramming.GameTheory;

import java.util.Scanner;
import java.util.Arrays;

public class stoneGame3LeetCode1406 {
    static int[] dp;
    public static int SG(int[] stone, int i) {
        // base
        if(i >= stone.length) {
            return 0;
        }
        // dp
        if(dp[i] != -1) {
            return dp[i];
        }
        // task
        int takeOne = stone[i];
        int takeTwo = 0;
        for(int j=i; j<Math.min(i+2, stone.length); j++) {
            takeTwo += stone[j];
        }
        int takeThree = 0;
        for(int j=i; j<Math.min(i+3, stone.length); j++) {
            takeThree += stone[j];
        }

        int onePass = takeOne - SG(stone, i+1);
        int twoPass = takeTwo - SG(stone, i+2);
        int threePass = takeThree - SG(stone, i+3);

        return dp[i] = Math.max(onePass, Math.max(twoPass, threePass));
    }
    public static String stoneGame(int[] stone) {
        dp = new int[stone.length];
        Arrays.fill(dp, -1);
        int ans = SG(stone, 0);
        return ans >= 0 ? (ans == 0 ? "Tie" : "Alice") : "Bob";
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
        System.out.println(stoneGame(stone));
    }
}
