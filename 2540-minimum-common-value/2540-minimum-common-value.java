class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int res = -1;
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                return nums1[i];
                // res = nums1[i];
                // i++;
                // j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        return res;
    }
}