class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxcount = 0;
        int cn;
        for(int i=0; i<sentences.length; i++){
            cn = count(sentences[i]);
            if(maxcount < cn){
                maxcount = cn;
            }
        }
        return maxcount;
    }

    int count(String str){
        str = str.trim();
        int cn = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                cn++;
            }
        }
        return cn+1;
    }
}