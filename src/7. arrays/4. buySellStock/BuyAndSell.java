/** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
Problem: Best time to buy and sell stock

Question: Given an array of stock prices, find the maximum profit you can make by buying once and selling once
Implements a single-pass algorithm tracking the minimum price seen so far and calculating the maximum profit possible
Time Complexity: O(n), Space Complexity: O(1)

Algorithm Approach:
- Track minimum price encountered so far
- For each price, calculate profit if sold at that price
- Update maximum profit if current profit is greater
- Single pass algorithm with O(1) space

Example:
- Input: [3, 2, 6, 5, 0, 3]
- Output: 4 (Buy at 2, Sell at 6)
- Input: [7, 1, 5, 3, 6, 4]
- Output: 5 (Buy at 1, Sell at 6)
- Input: [7, 6, 4, 3, 1]
- Output: 0 (Prices only decrease)

Edge Cases:
- Single element: Returns 0 (cannot make transaction)
- Decreasing prices: Returns 0 (no profit opportunity)
- Increasing prices: Returns difference of last and first
- All same prices: Returns 0

Constraints: Must buy before selling, can only transact once
*/

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
