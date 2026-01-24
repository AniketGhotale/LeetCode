class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int res[] = new int[2];
        int c1 = 0;
        int c2 = 0;
        for(int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            set2.add(nums2[i]);
        }
        for(int i=0; i<nums1.length; i++){
            if(set2.contains(nums1[i])){
                c1++;
            }
        }
        for(int i=0; i<nums2.length; i++){
            if(set1.contains(nums2[i])){
                c2++;
            }
        }
        res[0] = c1;
        res[1] = c2;
        return res;
    }
}