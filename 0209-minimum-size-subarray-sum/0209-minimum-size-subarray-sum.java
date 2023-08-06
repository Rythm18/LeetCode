class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res=nums.length+1,sum=0;
        int j=0;
        int i=0;
        int flag = 0;
        while(j<nums.length)
        {
            sum+=nums[j];
            while(sum>=target)
            {
                res=Math.min(res,j-i+1);
                sum-=nums[i];
                i++;
                flag = 1;
            }
            j++;
        }
        // j--;
        // sum=sum+nums[j];
        // if(sum>=target){
        //     res=Math.min(res,j-i+1);
        // }
        if(flag==0)
            return 0;
        return res;
    }
}