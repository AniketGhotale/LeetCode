class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if( !st.isEmpty() && ( s.charAt(i) == ']' && st.peek() == '[' )){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        
        return ( st.size() / 2+1 ) /2;
    }
}