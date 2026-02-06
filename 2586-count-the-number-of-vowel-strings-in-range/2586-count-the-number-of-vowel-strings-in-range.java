class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        String vowel = "aeiou";
        while(left <= right){
            int n = words[left].length()-1;
            char first = words[left].charAt(0);
            char last = words[left].charAt(n);
            if(vowel.indexOf(first) != -1 && vowel.indexOf(last) != -1){
                count++;
            }
            left++;
        }
        return count;
    }
}