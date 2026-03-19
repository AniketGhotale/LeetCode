class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        // int f = 0;
        // int i=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'i'){
                sb.reverse();
                // reverse(sb,s,f,i);
                // f=i+1;
            }else{
                sb.append(s.charAt(i));
            }
        }
        // for(i=f; i<s.length(); i++){
        //     sb.append(s.charAt(i));
        // }
        return sb.toString();
    }
    // void reverse(StringBuilder sb,String s, int f, int l){
    //     for(int i=l-1; i>=f; i--){
    //         sb.append(s.charAt(i));
    //     }
    // }
}