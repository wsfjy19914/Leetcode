/**
 * Created by fjy on 15/03/28.
 */
public class BestTimeBuyStock2 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1)
            return 0;

        int result = 0;

        for(int i = 1; i < prices.length; i ++){
            int profit = prices[i] - prices[i - 1];
            if(profit > 0)
                result += profit;
        }
        return result;
    }
}
