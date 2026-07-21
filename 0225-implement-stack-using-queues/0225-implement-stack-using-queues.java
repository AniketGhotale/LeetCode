class MyStack {

    int top = -1;
    ArrayList<Integer> arr = new ArrayList();
    public MyStack() {
        
    }
    
    public void push(int x) {
        top++;
        arr.add(x);
    }
    
    public int pop() {
        int data = arr.get(top);
        arr.remove(top);
        top--;
        return data;
    }
    
    public int top() {
         return arr.get(top);
    }
    
    public boolean empty() {
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */