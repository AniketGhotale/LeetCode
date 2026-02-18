class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans = 0;
        int f = 0;
        int l = nums.length-1;
        while(f < l){
            String s1 = Integer.toString(nums[f]);
            String s2 = Integer.toString(nums[l]);
            String s3 = s1+s2;
            // String s3 = nums[f] + "" + nums[l];
            ans+=Integer.parseInt(s3);
            f++;
            l--;
        }
        if(l == f){
            ans+=nums[l];
        }
        return ans;
    }
}