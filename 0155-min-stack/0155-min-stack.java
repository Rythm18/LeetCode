class MinStack {
    Stack<Integer> stk;
    Stack<Integer> minStack;
    public MinStack() {
        stk=new Stack<Integer>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        val = Math.min(val, minStack.isEmpty() ? val : minStack.peek());
        minStack.push(val);
    }
    
    public void pop() {
        stk.pop();
        minStack.pop();
    }
    
    public int top() {
        int re=stk.peek();
        return re;
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */