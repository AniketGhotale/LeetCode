class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                st.push(s.charAt(i));
            }else if(!st.isEmpty()){
                st.pop();
            }
        }
        for(int i=0; i<st.size(); i++){
            sb.append(st.get(i));
        }
        return sb.toString();
    }
}