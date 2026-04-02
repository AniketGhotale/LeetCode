class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '*'){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        for(int i=0; i<st.size(); i++){
            sb.append(st.get(i));
        }
        return sb.toString();
    }
}