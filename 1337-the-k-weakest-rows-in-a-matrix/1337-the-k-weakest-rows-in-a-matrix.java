class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int res[] = new int[m];
        for(int i=0; i<mat.length; i++){
            int count = 0;
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }else{
                    break;
                }
            }
            res[i] = count;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<res.length; i++){
            map.put(i,res[i]);
        }

        int arr[] = new int[k];
        int idx = 0;
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> e : list) {
            if(idx==k){
                break;
            }
            arr[idx] = e.getKey();
            idx++;
        }

    return arr;
    }
}