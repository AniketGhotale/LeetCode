class Solution {
    public boolean areOccurrencesEqual(String s) {
        int arr[] = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            arr[ch - 97]++;
        }
        int num = arr[s.charAt(0) - 97];
        for(int i=0; i<26; i++){
            if(arr[i] != 0 && arr[i] != num){
                return false;
            }
        }
        return true;
    }
}