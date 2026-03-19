class Solution {
    public boolean halvesAreAlike(String s) {
        String vowel = "aeiouAEIOU";
        int f = 0;
        int l = 0;
        int n = s.length()/2;
        for(int i=0; i<n; i++){
            if(vowel.indexOf(s.charAt(i)) != -1){
                f++;
            }
        }
        for(int i=s.length()-1; i>=n; i--){
            if(vowel.indexOf(s.charAt(i)) != -1){
                l++;
            }
        }
        return f==l;
    }
}