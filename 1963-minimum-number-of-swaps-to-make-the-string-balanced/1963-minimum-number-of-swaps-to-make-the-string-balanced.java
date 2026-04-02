class Solution {
    public int minSwaps(String s) {
        int count = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if( !st.isEmpty() && ( s.charAt(i) == ']' && st.peek() == '[' )){
                st.pop();
                count--;
            }else{
                st.push(s.charAt(i));
                count++;
            }
        }
        
        return ( st.size() / 2+1 ) /2;
    }
}