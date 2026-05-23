class Solution {
    public int findKOr(int[] nums, int k) {
        String ans = "";

        for (int i = 30; i >= 0; i--) {  
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & (1 << i)) != 0) {
                    count++;
                }
            }

            if (count >= k) ans += '1';
            else ans += '0';
        }

        return Integer.parseInt(ans, 2);
    }
}