class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            int id1 = nums1[i][0];
            int id2 = nums2[j][0];
            int val1 = nums1[i][1];
            int val2 = nums2[j][1];
            if(id1 == id2){
                list.add(new int[] {id1,(val1+val2)});
                i++;
                j++;
            }else if(id1 < id2){
                list.add(new int[] {id1,val1});
                i++;
            }else if(id1 > id2){
                list.add(new int[] {id2,val2});
                j++;
            }
        }
        while(i < nums1.length){
            list.add(new int[] {nums1[i][0],nums1[i][1]});
            i++;
        }
        while(j < nums2.length){
            list.add(new int[] {nums2[j][0],nums2[j][1]});
            j++;
        }
        int limit = list.size();
        int res[][] = new int[limit][2];
        for(int k=0; k<limit; k++){
            res[k] = list.get(k); 
        }
        // HashMap<Integer,Integer> map1 = new HashMap<>();
        // HashMap<Integer,Integer> map2 = new HashMap<>();
        // //int res[][] = new int[][];
        // int idx = 0;
        // int max = 0;
        // int limit = 0;
        // for(int i=0; i<nums1.length; i++){
        //     map1.put(nums1[i][0],nums1[i][1]);
        //     limit++;
        //     if(nums1[i][0] > max){
        //         max = nums1[i][0];
        //     }
        // }
        // for(int i=0; i<nums2.length; i++){
        //     map2.put(nums2[i][0],nums2[i][1]);
        //     if(nums2[i][0] > max){
        //         max = nums2[i][0];
        //     }
        //     if(!map1.containsKey(nums2[i][0])){
        //         limit++;
        //     }
        // }
        // int res[][] = new int[limit][2];
        // for(int i=0; i<=max; i++){
        //     if(map1.containsKey(i) && map2.containsKey(i)){
        //         res[idx][0] = i;
        //         res[idx][1] = (map1.get(i) + map2.get(i));
        //         idx++;
        //     }else if(map1.containsKey(i)){
        //         res[idx][0] = i;
        //         res[idx][1] = (map1.get(i));
        //         idx++;
        //     }else if(map2.containsKey(i)){
        //         res[idx][0] = i;
        //         res[idx][1] = (map2.get(i));
        //         idx++;
        //     }
        // }
        return res;
    }
}