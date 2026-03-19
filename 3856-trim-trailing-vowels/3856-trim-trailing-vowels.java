class Solution {
    public String trimTrailingVowels(String s) {
        String vowel = "aeiou";
        int idx = -1;
        for(int i=s.length()-1; i>=0; i--){
            if(vowel.indexOf(s.charAt(i)) == -1){
                idx = i;
                break;
            }
        }
        // if(idx<0){
        //     return "";
        // }
        return s.substring(0,idx+1);
    }
}