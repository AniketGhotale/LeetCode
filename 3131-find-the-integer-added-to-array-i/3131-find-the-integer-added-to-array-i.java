class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int num1s = Integer.MAX_VALUE;
        int num2s = Integer.MAX_VALUE;
        for(int i=0; i<nums1.length; i++){
            // set.add(nums2[i]);
            // for(int j=0; j<nums1.length; j++){
            //     if(set.contains(nums2[i] - nums1[j])){
            //         return nums2[i] - nums1[j];
            //     }else{
            //         set.add(nums2[i] - nums1[j]);
            //     }
            // }
            if(nums1[i] < num1s){
                num1s = nums1[i];
            }
            if(nums2[i] < num2s){
                num2s = nums2[i];
            }
        }
        // for(int i=0; i<1000; i++){
        //     if(set.contains(nums1[0] + i)){
        //         return i;
        //     }else if(set.contains(nums1[0] - i)){
        //         return -i;
        //     }
        // }
        return num2s - num1s;
    }
}