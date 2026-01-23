class Solution {
    public String truncateSentence(String s, int k) {
        s = s.trim();
        int cn = 0;
        int i=0;
        for(i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                cn++;
            }
            if(cn == k){
                break;
            }
        }
        return s.substring(0,i);
    }
}