// class Solution {
//     public int[] answerQueries(int[] nums, int[] queries) {
//         Arrays.sort(nums);
//         int res[] = new int[queries.length];
//         for(int i=0; i<res.length; i++){
//             res[i] = sum(queries[i],nums);
//         }
//         return res;
//     }
//     int sum(int num,int nums[]){
//         int j = 0;
//         int sum = 0;
//         for(int i=0; i<nums.length; i++){
//             sum += nums[j];
//             if(sum == num){
//                 return j+1;
//             }else if(sum < num){
//                 j++;
//             }
//         }
//         return -1;
//     }
// }





class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            res[i] = countElements(nums, queries[i]);
        }
        return res;
    }

    int countElements(int[] nums, int query) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum <= query) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
