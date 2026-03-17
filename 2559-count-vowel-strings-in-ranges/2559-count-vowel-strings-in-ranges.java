class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = queries.length;
        int res[] = new int[n];
        int word[]= new int[words.length];
        for(int i=0; i<words.length; i++){
            int f = 0;
            int l = words[i].length()-1;
            if((words[i].charAt(f) == 'a' || words[i].charAt(f) == 'e' ||words[i].charAt(f) == 'i' ||words[i].charAt(f) == 'o' ||words[i].charAt(f) == 'u') && (words[i].charAt(l) == 'a' || words[i].charAt(l) == 'e' ||words[i].charAt(l) == 'i' ||words[i].charAt(l) == 'o' ||words[i].charAt(l) == 'u')){
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