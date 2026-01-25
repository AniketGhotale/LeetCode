class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        //int res[][] = new int[][];
        int idx = 0;
        int max = 0;
        int limit = 0;
        for(int i=0; i<nums1.length; i++){
            map1.put(nums1[i][0],nums1[i][1]);
            limit++;
            if(nums1[i][0] > max){
                max = nums1[i][0];
            }
        }
        for(int i=0; i<nums2.length; i++){
            map2.put(nums2[i][0],nums2[i][1]);
            if(nums2[i][0] > max){
                max = nums2[i][0];
            }
            if(!map1.containsKey(nums2[i][0])){
                limit++;
            }
        }
        int res[][] = new int[limit][2];
        for(int i=0; i<=max; i++){
            if(map1.containsKey(i) && map2.containsKey(i)){
                res[idx][0] = i;
                res[idx][1] = (map1.get(i) + map2.get(i));
                idx++;
            }else if(map1.containsKey(i)){
                res[idx][0] = i;
                res[idx][1] = (map1.get(i));
                idx++;
            }else if(map2.containsKey(i)){
                res[idx][0] = i;
                res[idx][1] = (map2.get(i));
                idx++;
            }
        }
        return res;
    }
}