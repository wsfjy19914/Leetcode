/**
 * Created by fjy on 15/03/28.
 */
public class BestTimeBuyStock3 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2)
            return 0;

        int[] left = new int[prices.length];
        int[] right = new int[prices.length];

        int min = prices[0];

        left[0] = 0;

        for(int i = 1; i < prices.length; i ++)
        {
            if(prices[i] < min)
                min = prices[i];
            left[i] = Math.max(left[i - 1], prices[i] - min);
        }

        int max = prices[prices.length - 1];
        right[prices.length - 1] = 0;

        for(int i = prices.length - 2; i >= 0; i --)
        {
            if(prices[i] > max)
                max = prices[i];

            right[i] = Math.max(right[i + 1], max - prices[i]) ;
        }

        int result = 0;

        for(int i = 0; i < prices.length; i ++)
        {
            if(left[i] + right[i] > result)
                result = left[i] + right[i];
        }

        return result;
    }
}
