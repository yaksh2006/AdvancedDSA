package DynamicProgramming.BuyAndSellStock;
import java.util.*;

public class BestTimeToBuyAndSellStockLeetCode121 {
    public static int profit(int[] prices) {
        int price = prices[0];
        int ans = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i] > price) {
                ans = Math.max(ans, prices[i] - price);
            } else {
                price = Math.min(price, prices[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = in.nextInt();
        System.out.println("Enter the prices array: ");
        int[] prices = new int[n];
        for(int i=0; i<n; i++) {
            prices[i] = in.nextInt();
        }
        System.out.printf("The maximum profit is: %d", profit(prices));
    }
}
