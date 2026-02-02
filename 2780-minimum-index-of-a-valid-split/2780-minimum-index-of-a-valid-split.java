class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();

        // Step 1: Find dominant element of whole array
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int dominant = -1, totalCount = 0;
        for (int key : freq.keySet()) {
            if (freq.get(key) * 2 > n) {
                dominant = key;
                totalCount = freq.get(key);
                break;
            }
        }

        // Step 2: Try all split points
        int leftCount = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) == dominant) {
                leftCount++;
            }

            int leftSize = i + 1;
            int rightSize = n - leftSize;
            int rightCount = totalCount - leftCount;

            if (leftCount * 2 > leftSize && rightCount * 2 > rightSize) {
                return i;
            }
        }

        return -1;
    }
}


// class Solution {
//     public int minimumIndex(List<Integer> nums) {
//         for(int i=0; i<nums.size()-1; i++){
//             boolean res = valid(i,nums);
//             if(res){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     boolean valid(int i,List<Integer> nums){
//         HashMap<Integer,Integer> map = new HashMap<>();
//         HashMap<Integer,Integer> map1 = new HashMap<>();
//         boolean left = false;
//         boolean right = false;
//         for(int j=0; j<=i; j++){
//             map.put(nums.get(j),(map.getOrDefault(nums.get(j),0)+1));
//             // if(map.get(nums.get(j))*2 > (i+1)){
//             //     left = true;
//             // }
//         }
//         for(int j=i+1; j<nums.size(); j++){
//             map1.put(nums.get(j),(map1.getOrDefault(nums.get(j),0)+1));
//             // if(map1.get(nums.get(j))*2 > nums.size() - i - 1){
//             //     right = true;
//             // }
//         }
//         int leftt = i+1;
//         int rightt = nums.size()-i-1;
//         for (int key : map.keySet()) {
//             if (map.get(key) * 2 > leftt &&
//                 map1.getOrDefault(key, 0) * 2 > rightt) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }