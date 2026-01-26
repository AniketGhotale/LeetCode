class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return map.get(a) - map.get(b); 
            }
            return b - a;              
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }
}
// class Solution {
//     public int[] frequencySort(int[] nums) {
//         HashMap<Map.Entry<Integer,Integer>> map = new HashMap<>(map.entrySet());
//         for(int i=0; i<nums.length; i++){
//             map.put(nums[i],(map.getOrDefault(nums[i],0)+1));
//         }
//         map.sort((a, b) -> {
//         int cmp = a.getValue().compareTo(b.getValue());
//         if (cmp != 0) return cmp;
//         return a.getKey().compareTo(b.getKey());
//         });
//         int res[] = new int[nums.length];
//         int idx = 0;
//         for(int ele : map){
//             if(map.get(ele) <= 1){
//                 res[idx] = ele;
//                 idx++;
//             }else{
//                 while(map.get(ele) != 0){
//                     res[idx] = ele;
//                     idx++;
//                     map.put(ele,map.get(ele)-1);
//                 }
//             }
//         }
//         return res;
//     }
// }