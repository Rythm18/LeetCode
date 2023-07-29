class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre= new int[nums.length];
        int[] sux= new int[nums.length];

        pre[0]=nums[0];

        sux[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++)
        {
            pre[i]=nums[i]*pre[i-1];
        }

        for(int i=nums.length-2;i>=0;i--)
        {
            sux[i]=nums[i]*sux[i+1];
        }

        int[] ans = new int[nums.length];

        ans[0]=sux[1];
        ans[ans.length-1]=pre[nums.length-2];

        for(int i=1;i<nums.length-1;i++)
        {
            ans[i]=sux[i+1]*pre[i-1];
        }

        return ans;


    }
}