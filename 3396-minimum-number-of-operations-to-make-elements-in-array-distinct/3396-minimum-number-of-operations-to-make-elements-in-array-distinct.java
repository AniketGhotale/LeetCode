class Solution {
    public int minimumOperations(int[] nums) {
        //Arrays.sort(nums);
        int op = 0;
        while(true){
            HashSet<Integer> set = new HashSet<>();
            boolean dup = false;
            int start = op * 3;
            for(int i=start; i<nums.length; i++){
                if(set.contains(nums[i])){
                    dup = true;
                    break;  
                }else{
                set.add(nums[i]);
                }
            }
            if(!dup){
                return op;
            }
            op++;
            // if(nums[i-1] == nums[i]){
            //     op++;
            //     i = op * 3;
            //     if(nums.length - i < 3){
            //         return op;
            //     }
            // }
        }
    }
}