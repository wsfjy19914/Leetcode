/**
 * Created by fjy on 15/03/28.
 */
public class BestTimeBuyStock {
    public class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length == 0 || prices.length == 1)
                return 0;

            int max = 0;

            int[] minSoFar = new int[prices.length];
            minSoFar[0] = prices[0];

            for(int i = 1; i < prices.length; i ++)
            {
                if (prices[i] < minSoFar[i - 1])
                    minSoFar[i] = prices[i];
                else
                    minSoFar[i] = minSoFar[i - 1];
            }

            for(int i = 1; i < prices.length; i ++)
            {
                int profit = prices[i] - minSoFar[i];
                if(profit > max)
                    max = profit;
            }

            return max;
        }
    }
}
