class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int i=0;i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length; i++){
            set2.add(nums2[i]);
        }
        for(int x : set1){
            if(!set2.contains(x)){
                l1.add(x);
            }
        }
        for(int x : set2){
            if(!set1.contains(x)){
                l2.add(x);
            }
        }
        list.add(l1);
        list.add(l2);
        return list;
    }
}