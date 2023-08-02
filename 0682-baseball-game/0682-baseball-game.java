class Solution {
    public int calPoints(String[] operations) {
        Stack<String> stk = new Stack<>();
    
        for(int i=0;i<operations.length;i++)
        {
            String ch=operations[i];
            if(ch.charAt(0)=='+'){
                int k=Integer.parseInt(String.valueOf(stk.peek()));
                stk.pop();
                int j=Integer.parseInt(String.valueOf(stk.peek()));
                stk.pop();
                int ans=k+j;
                stk.push(String.valueOf(j));
                stk.push(String.valueOf(k));
                stk.push(String.valueOf(ans));
            }
            else if(ch.charAt(0)=='D'){
                int k=Integer.parseInt(stk.peek());
                int d=k*2;
                stk.push(String.valueOf(d));
            }
            else if(ch.charAt(0)=='C'){
                stk.pop();
            }
            else{
                stk.push(ch);
            }
        }
        int sum=0;
        while(!stk.empty()){
            sum+=Integer.valueOf(stk.peek());
            stk.pop();
        }
        return sum;
    }
}