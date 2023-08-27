class Solution {
    public int furthestDistanceFromOrigin(String s) {
        int cnt=0;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='_'){
                cnt+=1;
            }
            else if(s.charAt(i)=='L'){
                cnt1+=1;
            }
            else{
                cnt2+=1;
            }
            
        }
        
        int ans=Math.abs(cnt1-cnt2);
        
        return cnt+ans;
    }
}