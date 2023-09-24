class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] str = s.toCharArray();
            int cnt=0;
            for(int i=0;i<str.length;i++)
            {
                if(str[i]=='1'){
                    cnt++;
                }
            }
        String ans="";
        if(str[str.length-1]!='1'){
            
        
            for(int i=0;i<cnt-1;i++)
            {
                ans+='1';
            }
            for(int i=0;i<str.length-cnt;i++)
            {
                ans+='0';
            }
            ans+='1';
            
        }else{
            cnt--;
            for(int i=0;i<cnt;i++)
            {
                ans+='1';
            }
            for(int i=0;i<str.length-cnt-1;i++)
            {
                ans+='0';
            }
            ans+='1';
            
        }
        return ans;
    }
}