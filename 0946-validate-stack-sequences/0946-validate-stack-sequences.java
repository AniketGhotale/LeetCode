class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        int p1 = 1;
        int p2 = 0;
        int n = pushed.length;
        s.push(pushed[0]);

        while(p2 < n || !s.isEmpty()){
            if(!s.isEmpty() && s.peek() == popped[p2]){
                s.pop();
                p2++;
            }else if(p1 < n){
                s.push(pushed[p1]);
                p1++;
            }else{
                return false;
            }
        }
        return s.isEmpty();
    }
}