class Solution {
    public int totalMoney(int n) {
        int i = 0;
        int ans = 0;
        while (n >= 7) {
            ans += 28 + (i * 7);
            i++;
            n -= 7;
        }
        for (int j = 1; j <= n; j++) {
            ans += j + i;
        }
        return ans;
    }
}
