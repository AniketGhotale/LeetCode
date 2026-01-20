class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int low = prices[0];
        for(int i=1; i<prices.length; i++){ //buy
            int profit = prices[i] - low;
            maxprofit = Math.max(maxprofit, profit);

            low = Math.min(prices[i] , low);
            // for(int j=i+1; j<prices.length; j++){  //sell
            // int profit = (prices[j] - prices[i]);
            //     if(profit > maxprofit ){
            //         maxprofit = profit;
            //     }
            // }
            
        }
        return maxprofit;
    }
}