class Solution {
    public boolean checkIfPangram(String sentence) {
        for(int i='a'; i<='z'; i++){
            if(sentence.indexOf(i) == -1){
                return false;
            }
        }
        // int arr[] = new int[26];
        // if(sentence.length() < 26){
        //     return false;
        // }
        // for(int i=0; i<sentence.length(); i++){
        //     char ch = sentence.charAt(i);
        //     int idx = ch - 'a';
        //     arr[idx]++;
        // }
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] == 0){
        //         return false;
        //     }
        // }
        return true;
    }
}