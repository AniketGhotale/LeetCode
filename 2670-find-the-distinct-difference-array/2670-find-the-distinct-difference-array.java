class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // HashMap<Integer,Integer> map1 = new HashMap<>();
        int arr[] = new int[nums.length];
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i],i);
        // }
        for(int i=0; i<nums.length; i++){
            int curr=i;
            int left = 0;
            int right = 0;
            HashMap<Integer,Integer> map = new HashMap<>();
            HashMap<Integer,Integer> map1 = new HashMap<>();
            for(int j=curr; j>=0; j--){
                map.put(nums[j],j);
                // if(map.containsKey(nums[j])){
                //     left++;
                // }
            }
            for(int j=curr+1; j<nums.length; j++){
                map1.put(nums[j],j);
                // if(map.containsKey(nums[j])){
                //     right++;
                // }
            } 
            arr[i] = map.size() - map1.size();
        }
        return arr;
    }
}