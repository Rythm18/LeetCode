class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j=0,i=0;
        Stack<Integer> stk = new Stack<>();
        while(i<=pushed.length && j<popped.length)
        {
            if(!stk.isEmpty() && stk.peek()==popped[j]){
                stk.pop();
                j++;
            }else{
                if(i<pushed.length){
                    stk.push(pushed[i]);
                    i++;
                }else{
                    return false;
                }
                
            }
            
        }
        return stk.isEmpty();
    }
}