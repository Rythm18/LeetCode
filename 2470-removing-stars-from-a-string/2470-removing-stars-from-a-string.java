class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*' && !stk.isEmpty())
            {
                stk.pop();
            }
            else{
                stk.push(s.charAt(i));
            }
        }
        StringBuilder str=new StringBuilder("");
        while (!stk.isEmpty()) {
            str.append(stk.pop());
        }
        return str.reverse().toString();
    }
}