// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices1 = {3,2,6,5,0,3};
        System.out.println(maxProfit(prices1)); // Output: 4
        int[] prices2 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices2)); // Output: 5
        int[] prices3 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices3)); // Output: 0
        int[] prices4 = {2, 4, 1};
        System.out.println(maxProfit(prices4)); // Output: 2
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            }
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return maxProfit;
    }

}
