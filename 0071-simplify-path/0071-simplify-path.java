class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        sb.append('/');
        for(int i=0; i<arr.length; i++){
            String curr = arr[i]; 
            if( (curr.length() > 0 && (Character.isLetter(curr.charAt(curr.length()-1)) || Character.isLetter(curr.charAt(0)) || Character.isDigit(curr.charAt(curr.length()-1))) )||(curr.equals("...")||curr.equals("....") || curr.equals("_")) ){
                st.push(curr);
                // if(sb.charAt(sb.length()-1) == '/'){
                    
                // }else{
                //     st.push("/" + curr);
                // }
                
            }else if( !st.isEmpty() && curr.equals("..")){
                st.pop();
            }
        }
        for(int i=0; i<st.size(); i++){
            if(sb.charAt(sb.length()-1) == '/'){
                    sb.append(st.get(i));
                }else{
                    sb.append("/" + st.get(i));
                }

            //sb.append("/" + st.get(i));
        }
        // String prev = "";
        // for(int i=0; i<arr.length; i++){
        //     String curr = arr[i];
        //     if(curr.length() > 0 && sb.charAt(sb.length()-1) != '/' && Character.isLetter(curr.charAt(0))){
        //         sb.append(curr);
        //     }else if(curr != ".." || curr != "." || curr != prev){
        //         sb.append(curr);
        //     }
        //     prev = curr;
        // }
        return sb.toString();
    }
}