class Solution {
    public int maxChunksToSorted(int[] arr) {
        int score = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
            if(max == i){
                score++;
            }
        }
        
        return score;
    }
}