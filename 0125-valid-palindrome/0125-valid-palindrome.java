class Solution {
    public boolean isPalindrome(String s) {

        int first=0;
        int last = s.length()-1;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i)) ){
                sb.append(s.charAt(i));
            }
        }
        sb = new StringBuilder(sb.toString().toLowerCase());
        return sb.toString().equals(sb.reverse().toString());
        //while(first <last){
            // while(first < last && !Character.isLetterOrDigit(s.charAt(first))){
            //     first++;
            // }
            // while(first < last && !Character.isLetterOrDigit(s.charAt(last))){
            //     last--;
            // }
            // if(Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last))){
            //     return false;
            // }else{
            //     first++;
            //     last--;
            // }

        // }
        // return true;
    }
}
