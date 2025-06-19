package org.example;

public class BestTimeToBuyAndSellAStock {

   public int maxProfit(int[] prices) {
        int buy_price = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy_price) {
                buy_price = prices[i];
            } else {
                int current_profit = prices[i] - buy_price;
                profit = Math.max(current_profit, profit);
            }
        }

        return profit;
    }

    // Main method to run the code
    public static void main(String[] args) {
        int[] prices = {7, 2,4,5,1,3}; // Unique values  // For this max profit is 3 i.e arr5

        BestTimeToBuyAndSellAStock stock = new BestTimeToBuyAndSellAStock();
        int result = stock.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}
