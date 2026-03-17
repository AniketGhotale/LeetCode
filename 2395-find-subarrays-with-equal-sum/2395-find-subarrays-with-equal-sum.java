class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=1; i<nums.length; i++){
            //for(int j=i+1; j<nums.length; j++){
                int sum = 0;
                sum += nums[i];
                sum += nums[i-1]; 
                // for(int k=i; k<=i+1; k++){
                //     sum+=nums[k];
                // }
                if(set.contains(sum)){
                    return true;
                }else{
                    set.add(sum);
                }
            //}
        }
        return false;
    }
}