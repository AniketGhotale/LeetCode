class MyQueue {
    // int top = -1;
    // ArrayList<Integer> arr = new ArrayList();
    Stack<Integer> s = new Stack<>();
    public MyQueue() {
         
        
    }
    
    public void push(int x) {
        s.add(x);
    }
    
    public int pop() {
        Stack<Integer> s1 = new Stack<>();
        while(s.size()>1){
            s1.add(s.pop());
        }
        int data = s.pop();
        if(s1.size() < 1){
            return data;
        }else{
            while(!s1.isEmpty()){
                s.add(s1.pop());
            }
        return data;
        }
        
    }
    
    public int peek() {
        return s.get(0);
    }
    
    public boolean empty() {
        if(s.size() < 1){
            return true;
        }else{return false;}
        //return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */