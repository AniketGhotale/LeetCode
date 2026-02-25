class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if(prices[1] + prices[0] > money){
            return money;
        }else{
            return money - (prices[0] + prices[1]);
        }
    }
}