class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        while(left <= right){
            int n = words[left].length()-1;
            if( (words[left].charAt(0) == 'a' || words[left].charAt(0) == 'e' || words[left].charAt(0) == 'i' || words[left].charAt(0) == 'o' || words[left].charAt(0) == 'u')  && (words[left].charAt(n) == 'a' || words[left].charAt(n) == 'e' || words[left].charAt(n) == 'i' || words[left].charAt(n) == 'o' || words[left].charAt(n) == 'u' ) ){
                count++;
            }
            left++;
        }
        return count;
    }
}