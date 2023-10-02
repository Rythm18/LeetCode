class Solution {
    public boolean winnerOfGame(String colors) {
        int cntA=0,cntB=0,ans=0;
        for(int i=0;i<colors.length();i++)
        {
            if(colors.charAt(i)=='A')
            {
                cntA++;
                ans -= Math.max(0,cntB-2);
                cntB = 0;
            }
            else
            {
                cntB++;
                ans += Math.max(0 , cntA-2);
                cntA=0;
            }
        }
        ans -= Math.max(0,cntB-2);
        ans += Math.max(0 , cntA-2);
        
        return ans>0;

    }
}