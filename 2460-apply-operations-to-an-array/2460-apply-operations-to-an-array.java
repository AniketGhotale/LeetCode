// class Solution {
//     public int[] applyOperations(int[] nums) {
//         for(int i=0; i<nums.length-1; i++){
//             if(nums[i] == nums[i+1]){
//                 nums[i] = nums[i]*2;
//                 nums[i+1] = 0;
//             }
//         }
//         // for(int i=0; i<nums.length-1;i++){
//         //     if(nums[i] == 0){
//         //         int temp = nums[i];
//         //         nums[]
//         //     }
//         // }
//         int left = 0;
//         int right = nums.length-1;
//         while(left <= right){
//             while(nums[left] != 0){
//                 left++;
//             }
//             while(nums[right] == 0){
//                 right--;
//             }
//             int temp = nums[left];
//             nums[left] = nums[right];
//             nums[right] = temp;
//             left++;
//             right--;
//         }
//         return nums;
//     }
// }


class Solution {
    public int[] applyOperations(int[] nums) {

        // Step 1: Apply operations (UNCHANGED)
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // Step 2: Move zeros to the end (STABLE)
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }

        return nums;
    }
}
