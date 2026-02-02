class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            res[i] = nextnumber(nums1[i],nums2);
        }
        return res;
    }
    int nextnumber(int num,int[] nums2){
        int start = Integer.MAX_VALUE;
        for(int i=0; i<nums2.length; i++){
            if(nums2[i] == num){
                start = i;
                break;
            }
        }
        for(int i=start; i<nums2.length;i++){
            if(nums2[i] > num){
                return nums2[i];
            }
        }
        return -1;
    }
}