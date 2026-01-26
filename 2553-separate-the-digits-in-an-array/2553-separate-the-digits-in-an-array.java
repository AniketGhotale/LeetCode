class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] <=9){
                list.add(nums[i]);
            }else{
                String s = String.valueOf(nums[i]);
                for (char c : s.toCharArray()) {
                list.add(c - '0');
                // while(nums[i] > 0){
                //     int digits = (int) Math.log10(nums[i]) + 1;
                //     if(nums[i] / (int) Math.pow(10, digits - 1) == 0){
                //         list.add(0);
                //     }else{
                //         list.add(nums[i] / (int) Math.pow(10, digits - 1));
                //     }
                //     nums[i]= nums[i] % (int) Math.pow(10, digits - 1);
                }
            }
        }
        int res[] = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}