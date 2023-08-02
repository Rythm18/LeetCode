class Solution {
    public boolean isValid(String s) {
        // if(s.length()==1){
        //     return false;
        // }
        // if(s.charAt(0)==']'||s.charAt(0)=='}'||s.charAt(0)==')'){
        //     return false;
        // }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' ||s.charAt(i)=='{' ){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')' || s.charAt(i)==']' ||s.charAt(i)=='}' ) {
                char ch=s.charAt(i);
                if(stack.empty() && i<s.length()){
                    return false;
                }
                if(stack.peek()=='(' && ch==')'){
                    stack.pop();
                }
                else if(stack.peek()=='{' && ch=='}'){
                    stack.pop();
                }
                else if(stack.peek()=='[' && ch==']'){
                    stack.pop();
                }else{
                    return false;
                }
            }
            else{
                return false;
            }
        }

        if(stack.empty())
            return true;
        return false;
    }
}