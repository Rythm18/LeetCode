class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stk = new Stack<>();

    for (int i = 0; i < tokens.length; i++) {
        String ch = tokens[i];
        if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
            if (!stk.isEmpty()) {
                int p = stk.pop();
                int q = stk.pop();
                if (ch.equals("+")) {
                    int ans = q + p;
                    stk.push(ans);
                } else if (ch.equals("-")) {
                    int ans = q - p;
                    stk.push(ans);
                } else if (ch.equals("*")) {
                    int ans = q * p;
                    stk.push(ans);
                } else if (ch.equals("/")) {
                    int ans = q / p;
                    stk.push(ans);
                }
            }
        } else {
            int num = Integer.parseInt(ch);
            stk.push(num);
        }
    }
    int res = stk.peek();
    return res;
    }
}