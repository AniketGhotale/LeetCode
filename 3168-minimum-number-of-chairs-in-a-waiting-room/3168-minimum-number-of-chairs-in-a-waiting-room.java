class Solution {
    public int minimumChairs(String s) {
        int max = 0;
        int e = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'E'){
                e++;
                max = Math.max(max,e);
            }else{
                e--;
            }
        }
        return max;
    }
}