class Solution {
    public String minRemoveToMakeValid(String s) {
        int open = 0;
        int close = 0;
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                open++;
            }else if(s.charAt(i) == ')' && open>0){
                open--;
            }else if(s.charAt(i) == ')'){
                close++;
            }
        }
        
        for (int i = 0; i < sb.length() && close > 0; i++) {
            if (sb.charAt(i) == ')') {
                sb.deleteCharAt(i);
                close--;
                i--; // adjust index after deletion
            }
        }

        
            for(int i=sb.length()-1; open > 0 && i >= 0; i--){
                if(sb.charAt(i) == '('){
                    sb.deleteCharAt(i);
                    open--;
                }
            }
        
        
        return sb.toString();
    }

    
}