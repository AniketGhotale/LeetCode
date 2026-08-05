class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        
        if(n < 3 || (word.indexOf('@') != -1) || (word.indexOf('$') != -1) || (word.indexOf('#') != -1)){
            return false;
        }
        boolean vowel = false;
        boolean consonant = false;
        word = word.toLowerCase();
        for(int i=0; i<n; i++){
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                vowel = true;
            }else if(!Character.isDigit(ch)){
                consonant = true;
            }
        }

        return vowel && consonant;
    }
}