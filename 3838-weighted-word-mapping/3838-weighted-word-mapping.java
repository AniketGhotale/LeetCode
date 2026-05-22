class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res = "";

        for(int i=0; i<words.length; i++){
            int idx = getidx(words[i], weights) % 26;
            res += (char)('z' - idx);
        }
        return res;
    }

    int getidx(String s,int[] weights){
        int idx = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int id = ch - 'a';
            idx += weights[id];
        }
        return idx;
    }
}