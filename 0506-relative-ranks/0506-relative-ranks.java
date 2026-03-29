class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] res = new String[n];

        // Step 1: store value -> index
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(score[i], i);
        }

        // Step 2: sort scores
        Arrays.sort(score);

        // Step 3: assign ranks
        int rank = 1;
        for (int i = n - 1; i >= 0; i--) {
            int idx = map.get(score[i]);

            if (rank == 1) {
                res[idx] = "Gold Medal";
            } else if (rank == 2) {
                res[idx] = "Silver Medal";
            } else if (rank == 3) {
                res[idx] = "Bronze Medal";
            } else {
                res[idx] = String.valueOf(rank);
            }

            rank++;
        }

        return res;
    }
}