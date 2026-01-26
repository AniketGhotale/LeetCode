class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res= new ArrayList<>();
        for(int i=0; i<l.length; i++){
            int temp[] = new int[r[i] - l[i] + 1];
            int idx = 0;
            for(int j=l[i]; j<=r[i]; j++){
                temp[idx] = nums[j];
                idx++;
            }
            Arrays.sort(temp);
            boolean ans = isarithmetic(temp);
            res.add(ans);
        }
        return res;
    }
    boolean isarithmetic(int[] arr){
        int diff= arr[1] - arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1] - arr[i] != diff){
                return false;
            }
        }
        return true;
    }
}