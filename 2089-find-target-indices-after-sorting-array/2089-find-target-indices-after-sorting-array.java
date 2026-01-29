// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         List<Integer> list = new ArrayList<>();
//         int low = 0;
//         int high = nums.length-1;
//         Arrays.sort(nums);
//         int mid = 0;
//         while(low <= high){
//             mid = low + (high - low) / 2;
//             if(nums[mid] < target){
//                 low = mid+1;
//             }else if(nums[mid] > target){
//                 high = mid-1;
//             }else{
//                 list.add(mid);
//                 high = mid-1;
//                 low = mid+1;
//                 if(mid > 0){
//                     mid--;
//                 }
//             }
//         }
//         while(nums[mid] == target){
//             list.add(mid);
//             if(mid > 0){
//                 mid--;
//             }else{
//                 break;
//             }
//         }
//         Collections.sort(list);
//         return list;
//     }
// }



class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }

        return list;
    }
}
