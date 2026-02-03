class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res[] = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            map.put(arr1[i],(map.getOrDefault(arr1[i],0)+1));
        }
        int idx = 0;
        for(int i=0; i<arr2.length;i++){
            while(map.get(arr2[i]) != 0){
                res[idx] = arr2[i];
                idx++;
                map.put(arr2[i],map.get(arr2[i])-1);
            }
            map.remove(arr2[i]);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for(int key : keys){
            while(map.get(key) != 0){
                res[idx] = key;
                idx++;
                map.put(key,map.get(key)-1);
            }
        }
        return res;
    }
}