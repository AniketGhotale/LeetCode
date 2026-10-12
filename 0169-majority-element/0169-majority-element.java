class Solution {
    public int majorityElement(int[] nums) {
        int num = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                num = nums[i];
                count++;
            }else if(num == nums[i]){
                count++;
            }else{
                count--;
            }


        }
        return num;
    }
}



























/*

HashMap<Integer,Integer> map = new HashMap<>();
        int majorityele =0;
        int maxCount = 0;
        for(int i=0; i<nums.length; i++){
            //if(map.containsKey(nums[i])){
                map.put(nums[i],  map.getOrDefault(nums[i],0) + 1);
                if (map.get(nums[i]) > maxCount) {
                    maxCount = map.get(nums[i]);
                    majorityele = nums[i];
                }       
            //}
            // }else{
            //     map.put(nums[i] , 1);
            //     if (1 > maxCount) {
            //         maxCount = 1;
            //         majorityele = nums[i];
            //     }
            // }
        }

        return majorityele;


        */