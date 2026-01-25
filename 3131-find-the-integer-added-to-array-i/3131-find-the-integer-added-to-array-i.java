class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int num1s = nums1[0];//Integer.MAX_VALUE;
        int num2s = nums2[0]; //Integer.MAX_VALUE;
        for(int i=1; i<nums1.length; i++){
            if(nums1[i] < num1s){
                num1s = nums1[i];
            }
            if(nums2[i] < num2s){
                num2s = nums2[i];
            }
        }
        return num2s - num1s;
    }
}