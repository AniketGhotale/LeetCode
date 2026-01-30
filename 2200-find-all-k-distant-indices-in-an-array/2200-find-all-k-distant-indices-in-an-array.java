// class Solution {
//     public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
//         List<Integer> list = new ArrayList<>();
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i<nums.length; i++){
//             for(int j=0; j<nums.length; j++){
//                 if(Math.abs(i-j) <= k && nums[j] == key){
//                     if(!set.contains(i)){
//                         list.add(i);
//                         set.add(i);
//                     }
//                 }
//             }
//         }
//         return list;
//     }
// }


class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        boolean[] marked = new boolean[n];

        for (int j = 0; j < n; j++) {
            if (nums[j] == key) {
                int start = Math.max(0, j - k);
                int end = Math.min(n - 1, j + k);

                for (int i = start; i <= end; i++) {
                    if (!marked[i]) {
                        res.add(i);
                        marked[i] = true;
                    }
                }
            }
        }
        return res;
    }
}
