class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(i< 10 && nums[i] == i){
                return i;
            }
            if(i == add(nums[i])){
                return i;
            }
        }
        return -1;
    }
    int add(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num/=10;
        } 
        return sum;
    }
}