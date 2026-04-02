class Solution {
    public int minLengthAfterRemovals(String s) {
        //Stack<Character> st = new Stack<>();
        int ac = 0;
        int bc = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                ac++;
            }else{
                bc++;
            }
            // if(  !st.isEmpty() && (s.charAt(i) != st.peek())){
            //     st.pop();
            // }else{
            //     st.push(s.charAt(i));
            // }
        }
        //return st.size();
        return Math.abs(ac-bc);
    }
}