class Solution {
    public int minCostToMoveChips(int[] position) {
        int n = position.length;
        int even = 0;
        int odd = 0;
        for(int i=0; i<n; i++){
            if(position[i]%2==1){
                odd++;                
            }else{
                even++;
            }
        }
        return Math.min(even,odd);
    }
}