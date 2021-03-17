package LeetCodeProblems;


public class StockProfit {
    public int maxProfit(int[] prices) {

    int maxProfit = 0;
    for(int i = 0; i < prices.length - 1; i++) {
        for(int j = i + 1; j< prices.length; j++) {
            int profit = prices[j] - prices[i];
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }
    }
        return maxProfit;
    }
    public int maxProfit2(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
    // make transactions on any day
    public int maxProfit3(int[] prices) {
        return calculate(prices,0);

    }
    public int calculate(int[] prices, int s) {
        if(s >= prices.length) {
            return 0;
        }
        int max = 0;
        for(int start = s; start < prices.length; start++) {
            int maxProfit = 0;
            for(int i = start +1; i < prices.length; i++) {
                if(prices[start] < prices[i]) {
                    int profit = calculate(prices, i+1) + prices[i] - prices[start];
                    if(profit > maxProfit){
                        maxProfit = profit;
                    }
                }
                if(maxProfit > max){
                    max = maxProfit;
                }
            }
        }
        return max;
    }

    public int maxProfit4(int[] prices) {
        int i = 0;
        int maxProfit = 0;
        int valley = prices[0];
        int peak = prices[0];

        while(i < prices.length - 1) {
            while(i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
                valley = prices[i];
            }
            while(i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                i++;
                peak = prices[i];
            }
            maxProfit = maxProfit + peak - valley;
        }
        return maxProfit;
    }

    public int maxProfit5(int[] prices) {
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
    //hard level
    public int maxProfitMoving(int k, int[] prices) {
        int n = prices.length;

        if(n <= 0 || k <= 0){
            return 0;
        }
        if(2 *k > n) {
            int res = 0;
            for(int i = 1; i < n; i++) {
                res += Math.max(0, prices[i] - prices[i - 1]);
            }
            return res;
        }
        int[][][] dp = new int[n][k + 1][2];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= k; j++) {
                dp[i][j][0] = -1000_000_000;
                dp[i][j][1] = -1000_000_000;
            }
        }
        dp[0][0][0] = 0;
        dp[0][1][1] = -prices[0];

        for(int i = 1; i < n; i++) {
            for(int j = 0; j <= k; j++) {
                dp[i][j][0] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
                if(j > 0) {
                    dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
                }
            }
        }
        int res = 0;
        for(int j = 0; j <= k; j++) {
            res = Math.max(res, dp[n - 1][j][0]);
        }
        return res;
    }


}
