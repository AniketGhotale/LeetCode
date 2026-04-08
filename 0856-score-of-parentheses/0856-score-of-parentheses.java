class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        st.push(0);

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                st.push(0);
            }else{
                int v = st.pop();
                int count = Math.max(2 * v , 1);
                st.push(st.pop() + count);
            }
        }
        return st.pop();
    }
}