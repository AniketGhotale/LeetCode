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
        List<Integer> res = new ArrayList<Integer>();
        int len = nums.length;
        int doneTill = 0;
        for(int i = 0; i < len ; i++){
            if(nums[i]==key){
                int left = Math.max(doneTill,i-k);
                int right = Math.min(len-1,i+k);
                    while(left<=right){
                        res.add(left);
                        left++;
                    }
                    doneTill = right+1;
            }
        }         
        return res;
    }
}