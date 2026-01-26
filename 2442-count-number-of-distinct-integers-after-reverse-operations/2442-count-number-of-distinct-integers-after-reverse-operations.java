class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }

    int reverse(int num){
        int rev = 0;
        while(num > 0){
            //int last = num%10;
            rev = rev * 10 + num%10;
            num /= 10;
        }
        return rev;
    }
}