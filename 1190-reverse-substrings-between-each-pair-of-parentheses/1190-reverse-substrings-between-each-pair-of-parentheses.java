// class Solution {
//     int idx = 0;
//     public String reverseParentheses(String s) {
//         boolean flag = false;
//         StringBuilder sb = new StringBuilder();
//         for(int i=s.length()-1; i>=0; i--){
//             if(s.charAt(i) == '('){
//                 continue;
//             }else if(s.charAt(i) == ')'){
//                 change(sb, i-1, s);
//                 i=i-idx-2;
//             }else{
//                 sb.append(s.charAt(i));
//             }
//         }
//         return sb.toString();
//     }

//     void change(StringBuilder sb, int i, String s){
//         Stack<Character> st = new Stack<>();
//         while(s.charAt(i) != '('){
//             st.push(s.charAt(i));
//             i--;
//         }
//         idx = st.size();
//         while(!st.isEmpty()){
//             sb.append(st.pop());
//         }
//     }
// }









class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder curr = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(curr);
                curr = new StringBuilder();
            } 
            else if (c == ')') {
                curr.reverse();
                curr = st.pop().append(curr);
            } 
            else {
                curr.append(c);
            }
        }

        return curr.toString();
    }
}