class Solution {
    public int prefixCount(String[] words, String pref) {
        int count= 0;
        for(int i=0; i<words.length; i++){
            if(words[i].startsWith(pref)){
                count++;
            }
            // if(words[i].length() < pref.length()){
            //     continue;
            // }
            // for(int j=0; j<pref.length(); j++){
            //     if(words[i].charAt(j) != pref.charAt(j)){
            //         break;
            //     }
            //     if( j == pref.length()-1){
            //         count++;
            //     }
            //}
        }
        return count;
    }
}