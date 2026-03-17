class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = queries.length;
        int res[] = new int[n];
        int word[]= new int[words.length];
        for(int i=0; i<words.length; i++){
            int c = words[i].charAt(0);
            int l = words[i].charAt(words[i].length()-1);
            if(("aeiou".indexOf(c) != -1) && ("aeiou".indexOf(l) != -1)){
                    word[i] = 1;
                }else{
                    word[i] = 0;
                }
        }
        for(int i=0; i<n; i++){
            int s = queries[i][0];
            int l = queries[i][1];
            int count = 0;
            for(int j=s; j<=l; j++){
                count+=word[j];
            }
            res[i] = count;
        }
    return res;
    }
}