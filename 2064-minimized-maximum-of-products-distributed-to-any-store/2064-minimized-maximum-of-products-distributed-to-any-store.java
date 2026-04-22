class Solution {
    public int minimizedMaximum(int n, int[] quantities) {

        int left = 1;
        int right = 0;

        // find max element
        for (int q : quantities) {
            right = Math.max(right, q);
        }

        while (left < right) {
            int mid = (left + right) / 2;

            if (canDistribute(quantities, n, mid)) {
                right = mid;   // try smaller
            } else {
                left = mid + 1; // need bigger
            }
        }

        return left;
    }

    private boolean canDistribute(int[] quantities, int n, int max) {
        int stores = 0;

        for (int q : quantities) {
            stores += (q + max - 1) / max; // ceil(q/max)
        }

        return stores <= n;
    }
}