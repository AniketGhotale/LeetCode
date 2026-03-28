class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i=0; i<word.length(); i++){
            s.push(word.charAt(i));
            if(word.charAt(i) == ch){
                idx = i;
                while(!s.isEmpty()){
                    sb.append(s.pop());
                }
                break;
            }
        }
        if(idx == 0){
            return word;
        }
        return sb.toString() + word.substring(idx+1);
    }
}