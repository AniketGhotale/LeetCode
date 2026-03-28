class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i=0; i<word.length(); i++){
            s.push(word.charAt(i));
            if(word.charAt(i) == ch){
                idx = i;
                break;
            }
        }
        if(idx == 0){
            return word;
        }
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.toString() + word.substring(idx+1);
    }
}