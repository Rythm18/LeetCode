class FreqStack {
    List<Stack<Integer>> stack;
    Map<Integer,Integer> map;

    public FreqStack() {
        stack= new ArrayList<>();
        map=new HashMap<>();
        stack.add(new Stack());
    }
    
    public void push(int val) {
        int freq =map.getOrDefault(val,0)+1;
        map.put(val,freq);
        if(freq==stack.size())
            stack.add(new Stack());
        stack.get(freq).add(val);
    }
    
    public int pop() {
        
        Stack<Integer> stk = stack.get(stack.size()-1);
        int x=stk.pop();
        if(stk.size()==0)
            stack.remove(stack.size()-1);
        map.put(x,map.get(x)-1);
        return x;
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */