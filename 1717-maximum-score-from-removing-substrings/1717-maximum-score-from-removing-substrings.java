class Solution {
    public int maximumGain(String s, int x, int y) {
        int score = 0;
    char arr[] = s.toCharArray();
    Stack<Character> st = new Stack<>();
     st.push(arr[0]);
    if(x < y){
        for(int i=1; i<arr.length; i++){
            if(!st.isEmpty() && arr[i] == 'a' && st.peek() == 'b'){
                score += y;
                st.pop();
            }else{
                st.push(arr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
            for (char c : st) sb.append(c);

            st.clear();

            // Second pass: remove "ab"
            for (char c : sb.toString().toCharArray()) {
                if (!st.isEmpty() && st.peek() == 'a' && c == 'b') {
                    score += x;
                    st.pop();
                } else {
                    st.push(c);
                }
            }

    }else{
        for(int i=1; i<arr.length; i++){
            if(!st.isEmpty() && arr[i] == 'b' && st.peek() == 'a'){
                score += x;
                st.pop();
            }else{
                st.push(arr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
            for (char c : st) sb.append(c);

            st.clear();

            // Second pass: remove "ba"
            for (char c : sb.toString().toCharArray()) {
                if (!st.isEmpty() && st.peek() == 'b' && c == 'a') {
                    score += y;
                    st.pop();
                } else {
                    st.push(c);
                }
            }
    }
    
        // for(int i=0; i<arr.length-1; i++){
        //     if(arr[i] == 'b' && arr[i+1] == 'a'){
        //         score += y;
        //         arr[i] = 'x';
        //         arr[i+1] = 'x';
        //     }
        // }
        // for(int i=arr.length-1; i>0; i--){
        //     if(arr[i] == 'b' && arr[i-1] == 'a'){
        //         score += x;
        //         arr[i] = 'x';
        //         arr[i-1] = 'y';
        //     } 
        // }
        // Stack<Character> st = new Stack<>();
        // int n = s.length();
        // st.push(s.charAt(n-1));
        // for(int i=n-2; i>1; i--){
        //     if(s.charAt(i) == 'a' && s.charAt(i-1)== 'b'){
        //         i = i-2;
        //         score += y;
        //     }else if(s.charAt(i) == 'a' && st.peek() == 'b'){
        //         score += x;
        //         st.pop();
        //     }else{
        //         st.push(s.charAt(i));
        //     }
        // }
        return score;
    }
}