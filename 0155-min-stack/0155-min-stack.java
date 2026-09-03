class MinStack {

    public Stack<Integer> s;
    public Stack<Integer> smin = new Stack<>();
    public int min;
    public MinStack() {
        s = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int value) {
        s.push(value);
        if(min >= value){
            min = value;
            smin.push(min);
        }
    }
    
    public void pop() {
        if( (!s.isEmpty() && !smin.isEmpty()) && ( s.peek().equals(smin.peek()) ) ){
            smin.pop();
            if(!smin.isEmpty()){
                min = smin.peek();
            }else{
                min = Integer.MAX_VALUE;
            }
        }
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return smin.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */