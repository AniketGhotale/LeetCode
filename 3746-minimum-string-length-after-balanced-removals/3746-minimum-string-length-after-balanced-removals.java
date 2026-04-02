class Solution {
    public int minLengthAfterRemovals(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(  !st.isEmpty() && (s.charAt(i) == 'a' && st.peek() == 'b' )){
                st.pop();
            }else if(!st.isEmpty() && (s.charAt(i) == 'b' && st.peek() == 'a' )){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }
}