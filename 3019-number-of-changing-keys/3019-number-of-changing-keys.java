class Solution {
    public int countKeyChanges(String s) {
        s = s.toLowerCase();
        //HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1) != s.charAt(i)){
                count++;
            }
        }
        return count;
    }
}