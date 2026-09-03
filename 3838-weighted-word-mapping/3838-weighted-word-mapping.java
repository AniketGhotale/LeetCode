class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        
        StringBuilder sb = new StringBuilder();
        int n = words.length;
        for(String word : words){
            int res = getres(word,weights);
            int idx = 'z' - res;
            sb.append((char) idx);
        }
        return sb.toString();
    }
    int getres(String s, int[] arr){
        int res = 0;
        for(char ch : s.toCharArray()){
            int idx = ch - 'a';
            res += arr[idx];
        }
        return res % 26;
    }
}