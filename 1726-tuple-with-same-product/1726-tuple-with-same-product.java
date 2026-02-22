class Solution {
    public int tupleSameProduct(int[] nums) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int p = nums[i] * nums[j];
                map.put(p,map.getOrDefault(p,0)+1);
            }
        }
        for(int value : map.values()){
            if(value > 1){
                count+=(value * (value - 1) / 2) * 8;
            }
        }
        return count;
    }
    // boolean isSame(int i, int j){
    //     int 

    // }
}