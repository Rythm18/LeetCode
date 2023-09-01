class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        ans[0]=0;
        for(int i=1;i<n+1;i++){
            int x=countB(i);
            ans[i]=x;
        }
        return ans;
    }
    public int countB(int n)
    {
        int ans=0;
        String str=Integer.toBinaryString(n);
        for(char s : str.toCharArray())
        {
            if(s=='1')
                ans++;
        }
        return ans;
    }
}