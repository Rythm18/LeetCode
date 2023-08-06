class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0,j=0;
        double ans=Integer.MIN_VALUE,sum=0;
        while(j<nums.length)
        {
            sum+=nums[j];
            if(j-i+1==k)
            {
                ans=Math.max(ans,sum/k);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        
        return ans;
    }
}