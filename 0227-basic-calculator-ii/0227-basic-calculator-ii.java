class Solution {
    public int calculate(String s) {
        s = s.trim();
        String op = "+";
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            String ch = "";
            
            //if(Character.isDigit())
            char curr = s.charAt(i);
            //ch = ch + curr;
            while(i<s.length()  && Character.isDigit(s.charAt(i))){
                ch = ch + s.charAt(i);
                i++;
                // if(i < s.length()){
                //      curr = s.charAt(i);
                // }
               
            }
            
            if(!ch.equals("")){
                int num = Integer.parseInt(ch);

                if(op.equals("*")){
                    int n = st.pop();
                    st.push(n*num);
                }else if(op.equals("/")){
                    int n = st.pop();
                    st.push(n / num);
                }else if(op.equals("-")){
                    st.push(-num);
                }else if(op.equals("+")){
                    st.push(num);
                }
            }

            // if(op.equals("*")){
            //     int n = st.pop();
            //     st.push(n*Integer.parseInt(ch));
            //     op = "";
            // }else if(op.equals("/")){
            //     int n = st.pop();
            //     st.push(n/Integer.parseInt(ch));
            //     op = "";
            // }else if(op.equals("-")){
            //     st.push(-ch);
            //     op = "";
            // }else if(!ch.equals("")){
            //     st.push(Integer.parseInt(ch));
            // }
        if(i < s.length()){
            curr = s.charAt(i);
            if(curr == '*'){
                op = "*";
            }else if(curr == '/'){
                op = "/";
            }else if(curr == '-'){
                op = "-";
            }else if(curr == '+'){
                op = "+";
            }

        }

            // if(Character.isDigit(ch)){
            //     st.push(ch - '0');
            // }
        } 

        int ans = 0;

        while(!st.isEmpty()){
            ans += st.pop();
            // char ch = s.charAt(i);
            // if(ch == '*'){
            //     int n1 = st.pop();
            //     int n2 = st.pop();
            //     st.push(n2*n1);
            // }else if(ch == '/'){
            //     int n1 = st.pop();
            //     int n2 = st.pop();
            //     st.push(n2/n1);
            // }else if(ch == '+'){
            //     int n1 = st.pop();
            //     int n2 = st.pop();
            //     st.push(n2+n1);
            // }else if(ch == '-'){
            //     int n1 = st.pop();
            //     int n2 = st.pop();
            //     int res = n2-n1;
            //     st.push(res);
            // }
        }

        return ans;
    }
}