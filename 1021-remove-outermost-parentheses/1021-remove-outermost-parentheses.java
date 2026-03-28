class Solution {
    public String removeOuterParentheses(String s) {
        char arr[] = s.toCharArray();
        Stack<Character> st = new Stack<>();
        String str = "";
        int open = 0;
        int close = 0;
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == '('){
                open++;
            }else{
                open--;
            }
            if(open == 0){
                arr[idx] = '0';
                arr[i] = '0';
                idx = i+1;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] != '0'){
                str = str + arr[i];
            }
        }
        return str;
    }
}