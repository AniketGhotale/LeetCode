class Solution {
    public String decodeString(String s) {
        
        Stack<String> st = new Stack<>();
        // StringBuilder sb = new StringBuilder();
        // StringBuilder temp = new StringBuilder();

        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch == ']'){
                st.push("]");
                // sb.append(temp);
                // temp.setLength(0);
            }else if(Character.isLetter(ch)){
                st.push(ch +"");
                //temp.append(ch);
            }else if(ch == '['){
                StringBuilder temp = new StringBuilder();

                while (!st.peek().equals("]")) {
                    temp.append(st.pop());
                }

                st.pop();

                int num = 0;
                int place = 1;
                i--;
                while (i >= 0 && Character.isDigit(s.charAt(i))) {
                    num += (s.charAt(i) - '0') * place;
                    place *= 10;
                    i--;
                }

                i++;
                String str = temp.toString().repeat( num -1 );
                temp.append(str);
                st.push(temp.toString());
            }
        }
            StringBuilder ans = new StringBuilder();

            while (!st.isEmpty()) {
                ans.append(st.pop());
            }

        return ans.toString();
        //     else if( (Character.isDigit(ch))){
                
        //         int num = 0;
        //         int place = 1;

        //         while (i >= 0 && Character.isDigit(s.charAt(i))) {
        //             num += (s.charAt(i) - '0') * place;
        //             place *= 10;
        //             i--;
        //         }

        //         i++;
        //         String str = temp.toString().repeat( (num) -1);
        //         temp.append(str);
        //     }
        // }
        // sb.append(temp);
        // return sb.reverse().toString();





        // int num = 0;
        // boolean flag = false;
        // Stack<Character> st = new Stack<>();
        // for(int i=s.length()-1; i>=0; i--){
        //     char ch = s.charAt(i);
        //     StringBuilder sb = new StringBuilder();
        //     if(ch == ']'){
        //         flag = true;
        //     }else if(ch == '['){
        //         flag = false;
        //         for(int j=0; j<sb.size(); j++){

        //         }
        //     }else if(Character.isLetter(ch) && flag){
        //         sb.append(ch);
        //         st.push(ch);
        //     }else if(Character.isLetter(ch)){
        //         st.push(ch);
        //     }
        //     if(Character.isDigit(ch)){
        //         num = ch - '0';
        //     }
        // }
    }
}