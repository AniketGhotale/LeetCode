class Solution {
    public int maxCoins(int[] piles) {
        int res = 0;
        int left = 0;
        int right = piles.length-2;
        Arrays.sort(piles);
        while(left < right){
            res += piles[right];
            left++;
            right -= 2;
        }
        return res;
    }
}