class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        int n = operations.length;
        for(int i=0; i<n; i++){
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                res++;
            }else{
                res--;
            }
        }
        return res;
    }
}