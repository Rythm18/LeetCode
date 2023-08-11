class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int x=prices[0];

        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<x){
                x=prices[i];
            }else{
                ans+=prices[i]-x;
                x=prices[i];
            }
        }
        return ans;
    }
}