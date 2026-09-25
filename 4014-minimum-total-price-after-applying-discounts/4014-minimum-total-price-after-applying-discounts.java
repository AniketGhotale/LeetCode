class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        // int s = 0;
        // int h = prices.length-1;
        // while(s < h){
        //     int temp = prices[s];
        //     prices[s] = prices[h];
        //     prices[h] = temp;
        //     s++;
        //     h--;

        // }
        // Arrays.sort(discounts);
        // s = 0;
        // h = discounts.length - 1;
        // while(s < h){
        //     int temp = discounts[s];
        //     discounts[s] = discounts[h];
        //     discounts[h] = temp;
        //     s++;
        //     h--;
        // }
        // int l = prices.length > discounts.length ? discounts.length : prices.length;
        // double res = 0;
        // for(int i=0; i<l; i++){
        //     res = res + ( prices[i] * (100 - discounts[i]) / 100.0);
        // }


        int l = prices.length > discounts.length ? discounts.length : prices.length;
        int s = prices.length-1;
        int h = discounts.length-1;
        double res = 0;
        while(s >= 0 && h >= 0){
            res = res + (prices[s] * (100.0 - discounts[h]) / 100);
            s--;
            h--;
        }
        

        for(int i=s; i>=0; i--){
            res += prices[i];
        }
        return res;
    }
}