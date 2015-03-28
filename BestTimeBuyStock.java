/**
 * Created by fjy on 15/03/28.
 */
public class BestTimeBuyStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1)
            return 0;

        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i ++)
        {
            if (prices[i] < min)
                min = prices[i];

            int profit = prices[i] - min;
            if(profit > max)
                max = profit;
        }

        return max;
    }
}
