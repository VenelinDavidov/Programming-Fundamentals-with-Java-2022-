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

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // по-добър ден за купуване
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}