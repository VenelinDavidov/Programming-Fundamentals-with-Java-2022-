package Top_Interview;

import java.util.Scanner;

public class Best_Time_Buy_And_Sell_Stock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit (prices);
        System.out.println(result);
    }

    //Input: prices = [7,1,5,3,6,4]
    //Output: 5
    //Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    //Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

    private static int maxProfit(int[] prices) {

        int min = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < min){
                min = prices[i];
            }
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}
