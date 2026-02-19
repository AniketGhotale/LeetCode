class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int first[] = new int[26];
        for(int i=0; i<26; i++){
            first[i] = -1;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int idx = ch - 97;
            if(first[idx] == -1){
                first[idx] = i;
            }else{
                int dist = i - first[idx]-1;
                if(dist != distance[idx]){
                    return false;
                }
            }
            // if(distance[idx] != Math.abs(s.indexOf(ch) - s.substring(s.indexOf(ch)+1,s.length()).indexOf(ch))-1){
            //     return false;
            // }
        }
        return true;
    }
}