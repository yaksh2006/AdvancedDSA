package DynamicProgramming.GameTheory;

import java.util.Scanner;

public class ArrayInput {
    public static void input(int[] num) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Array: ");
        for(int i=0; i<num.length; i++) {
            num[i] = in.nextInt();
        }
    }
    public static void dpTwoDimFill(int[][] dp) {
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
    }
}
