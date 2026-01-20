class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int maxbuyprice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){ //buy
            if(prices[i] < maxbuyprice){
                maxbuyprice = prices[i];
            }else{
                int profit = prices[i] - maxbuyprice;
                maxprofit = Math.max(profit,maxprofit);
            }
            // int profit = prices[i] - low;
            // maxprofit = Math.max(maxprofit, profit);

            // low = Math.min(prices[i] , low);
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