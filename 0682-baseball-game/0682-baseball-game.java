class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
          
        for(String s : ops){
            
              if( s.equals("C")){
                 stack.pop();
             }
             else if(s.equals("D")){
                 stack.push(2* stack.peek());
             }
              else if(s.equals("+")){
                 
                  if(stack.size() >=2){
                     int res1= stack.pop();
                     int res2= stack.pop();
                     int res= res1+res2;
                     stack.push(res2);
                     stack.push(res1);
                     stack.push(res); 
                  }
             }
             else{
                 stack.push(Integer.parseInt(s));
             }
        }
        int ans =0;
         while(!stack.isEmpty()){
            ans += stack.pop();
         }
        return ans;
    }
}