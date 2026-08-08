package DynamicProgramming.BuyAndSellStock;
import java.util.Scanner;

class Solution {
    static int[][][] dp;
    public static int MP(int[] prices, int i, int buy, int k) {
        // base
        if(i == prices.length || k == 0) {
            return 0;
        }
        // dp
        if(dp[i][buy][k] != -1) return dp[i][buy][k];

        // task
        int op1 = 0; int op2 = 0;
        if(buy == 1) {
            int take = -prices[i] + MP(prices, i+1, 0, k);
            int skip = MP(prices, i+1, 1, k);
            op1 = Math.max(take, skip);
        }
        if(buy == 0) {
            int sell = prices[i] + MP(prices, i+1, 1, k-1);
            int skip = MP(prices, i+1, buy, k);
            op2 = Math.max(sell, skip);
        }
        return dp[i][buy][k] = Math.max(op1, op2);
    }
    public static int maxProfit(int[] prices, int i, int buy, int k) {
        dp = new int[prices.length][2][k+1];
        for(int p=0; p<prices.length; p++) {
            for(int q=0; q<2; q++) {
                for(int r=0; r<=k; r++) {
                    dp[p][q][r] = -1;
                }
            }
        }
        return MP(prices, i, buy, k);
    }
}
public class bestTimeToBuyAndSellStockIVLeetCode188 {
    public static int buyAndSell(int[] prices, int k) {
        return Solution.maxProfit(prices, 0, 1, k);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the K most Transactions: ");
        int k = in.nextInt();
        System.out.println("Enter the size of a price array: ");
        int n = in.nextInt();
        System.out.println("Enter the prices array: ");
        int[] prices = new int[n];
        for(int i=0; i<n; i++) {
            prices[i] = in.nextInt();
        }
        System.out.printf("The Maximum profit is: %d", buyAndSell(prices, k));
    }
}
