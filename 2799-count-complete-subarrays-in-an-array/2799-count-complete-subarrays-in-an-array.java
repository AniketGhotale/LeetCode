class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int n = set.size();
        for(int i=0; i<nums.length; i++){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j=i;j<nums.length; j++){
                map.put(nums[j],(map.getOrDefault(map.get(nums[j]),0)+1));
                if(map.size() == n){
                    count++;
                }
            } 
        }
        return count;
    }
    // boolean isequal(int i,int j,int n,int[] nums){
    //     HashSet<Integer> set2 = new HashSet<>();
    //     for(int k=i;k<=j;k++){
    //         set2.add(nums[k]);
    //     }
    //     if(set2.size() == n){
    //         return true;
    //     }
    //     return false;
    // }
}