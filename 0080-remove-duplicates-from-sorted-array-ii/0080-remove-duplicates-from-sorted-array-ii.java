class Solution {
    public int removeDuplicates(int[] nums) {

        int k=2;
        for(int i=2; i<nums.length; i++){
            if(nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }
        // int f = 0;
        // int s = 1;
        // int k=0;
        // while(s < nums.length-1){
        //     if(nums[f] == nums[s]){
        //         nums[k] = nums[f];
        //         nums[k++] = nums[s];
        //         k++;
        //         while(nums[f] == nums[s] && s < nums.length){
        //             f++;
        //             s++;
        //         }
        //     }else{
        //         f++;
        //         s++;
        //     }
        // }
        return k;
    }
}