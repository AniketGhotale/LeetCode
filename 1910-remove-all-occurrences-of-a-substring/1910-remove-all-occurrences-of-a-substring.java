class Solution {
    public String removeOccurrences(String s, String part) {
        
        Stack<Character> st = new Stack<>();
        int n = part.length();
        //int idx = 0;

        while(s.indexOf(part) != -1){
            int idx = s.indexOf(part);
            s = s.substring(0,idx) + s.substring(idx+n);
        }
        return s;
        
    }
}