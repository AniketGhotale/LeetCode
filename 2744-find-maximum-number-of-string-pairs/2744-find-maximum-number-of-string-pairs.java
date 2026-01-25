class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){
                if(isReverse(words[i],words[j])){
                    count++;
                }
            }
        }
        return count;
    }
    boolean isReverse(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int last = str1.length()-1;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(last)){
                return false;
            }
            last--;
        }
        return true;
    }
}