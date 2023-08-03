class MinStack {
    Stack<Integer> stk;
    public MinStack() {
        stk=new Stack<Integer>();
    }
    
    public void push(int val) {
        stk.push(val);
    }
    
    public void pop() {
        if(!stk.empty()) stk.pop();
    }
    
    public int top() {
        int re=stk.peek();
        return re;
    }
    
    public int getMin() {
        Iterator value = stk.iterator();
        int max=(int)stk.peek();
        while(value.hasNext()){
            int x=(int)value.next();
            max=Math.min(max,x);
        }
        return max;
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