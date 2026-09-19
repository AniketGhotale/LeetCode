class Solution {
    public boolean rotateString(String s, String goal) {
        int start = s.indexOf(goal.charAt(0));
        if(s.length() != goal.length() || start == -1){
            return false;
        }
        while(start != -1){

            String s1 = s.substring(start) + s.substring(0 , start);
            if(s1.equals(goal)){
                return true;
            }else{
                int prev = start;
                String temp = s.substring(start+1);
                if(temp.indexOf(goal.charAt(0)) == -1){
                    return false;
                }
                start = temp.indexOf(goal.charAt(0)) + prev +1;
            }
        }
        

        // int n = s.length();
        // for(int i=0; i<goal.length(); i++){
        //     if(s.charAt(start) != goal.charAt(i)){
        //         return false;
        //     }
        //     start = start+1/n;
        // }
        return false;
    }
}