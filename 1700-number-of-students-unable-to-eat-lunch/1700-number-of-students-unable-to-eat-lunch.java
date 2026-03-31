class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> s = new Stack<>();
       Queue<Integer> q = new LinkedList<>();
        int n =sandwiches.length;
        for(int i=n-1; i>=0; i--){
            s.push(sandwiches[i]);
        }
        for(int i=n-1; i>=0; i--){
            q.add(students[i]);
        }
        int k=0;
        while(true){
            if(q.isEmpty()){
                return 0;
            }
            if(s.peek() == q.peek()){
                s.pop();
                q.poll();
                k=0;
            }else{
                int st = q.poll();
                q.add(st);
                k++;
            }
            if(q.size() == k){
                return k;
            }
        }
    }
}