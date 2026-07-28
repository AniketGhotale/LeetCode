class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int n1 = 0;
        int n2 = 0;
        for(String ch : tokens){
            
            switch(ch){
                case "+" :
                    n1 = st.pop();
                    n2 = st.pop();
                    st.push(n2 + n1);
                    break;

                case "-" :
                    n1 = st.pop();
                    n2 = st.pop();
                    st.push(n2 - n1);
                    break;

                case "*":
                    n1 = st.pop();
                    n2 = st.pop();
                    st.push(n2*n1);
                    break;
                
                case "/":
                    n1 = st.pop();
                    n2 = st.pop();
                    st.push(n2/n1);
                    break;
                
                default:
                    st.push(Integer.parseInt(ch));
                    break;

                
            }
            
        }
        return st.peek();
    }
}