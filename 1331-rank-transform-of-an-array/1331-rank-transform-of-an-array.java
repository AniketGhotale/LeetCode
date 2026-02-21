class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp[] = new int[n];
        int res[] = new int[n];
        for(int i=0; i<n; i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        int rank = 1;
        for(int i=0; i<n; i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],rank);
                rank++;
            }
            
        }
        
        for(int i=0; i<n; i++){
            res[i] = map.get(arr[i]);            
        }
        return res;
    }
}