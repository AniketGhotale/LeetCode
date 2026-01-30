class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            set2.add(nums2[i]);
        }
        for(int i=0; i<nums3.length; i++){
            set3.add(nums3[i]);
            if(set1.contains(nums3[i]) || set2.contains(nums3[i])){
                res.add(nums3[i]);
            }
        }
        for(int i=0; i<nums2.length; i++){
            if(set1.contains(nums2[i]) || set3.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        for(int val : res){
            list.add(val);
        }
        return list;
    }
}