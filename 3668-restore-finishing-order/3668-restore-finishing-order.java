class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = friends.length;
        int k = order.length;
        int res[] = new int[n];
        int idx = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            set.add(friends[i]);
        }

        for(int i=0; i<k; i++){
            if(set.contains(order[i])){
                res[idx] = order[i];
                idx++;
            }
        }

        return res;
    }
}