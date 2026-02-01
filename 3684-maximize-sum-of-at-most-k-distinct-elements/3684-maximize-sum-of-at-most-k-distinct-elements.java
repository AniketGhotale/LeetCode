class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int s = 0;
        for(int i=nums.length-1; i>=0; i--){
            if(!set.contains(nums[i])){
                list.add(nums[i]);
                //sum += nums[i];
                s++;
                set.add(nums[i]);
            }
            if( s == k){
                break;
            }
        }
        int res[] = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}