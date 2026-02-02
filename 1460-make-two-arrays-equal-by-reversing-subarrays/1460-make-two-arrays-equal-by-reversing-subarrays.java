class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int res[] = new int[1001];
        for(int i=0; i<arr.length; i++){
            res[arr[i]]++;
        }
        for(int i=0; i<target.length; i++){
            res[target[i]]--;
        }
        for(int i=0; i<res.length; i++){
            if(res[i] != 0){
                return false;
            }
        }
        return true;
    }
}