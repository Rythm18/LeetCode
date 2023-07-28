class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int x=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>x)
            {
                max=Math.max(max,prices[i]-x);
                
            }else{
                x=prices[i];
            }

        }
        return max;
    }
}
