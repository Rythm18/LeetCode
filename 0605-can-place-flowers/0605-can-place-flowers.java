class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
       int x=0,ans=0;
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]==0)
           {
               x++;
           }
           else
           {
               if(x==i)
               {
                   ans+=x/2;
               }
               else if(x>2)
               {
                   ans+=(x-1)/2; 
               }
               x=0;
           }
       }
        if(x>1)
        {
            ans+=x/2; 
        }

        if(nums[0]==0 && nums.length==1)
            return true;

        if(x==nums.length)
            ans = (x+1)/2;

        return ans>=n;
    }
}