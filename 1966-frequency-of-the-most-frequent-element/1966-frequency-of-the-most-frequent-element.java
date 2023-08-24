class Solution {
    public int maxFrequency(int[] nums, int k) {
        int j=0,i=0;
        long total=0;
        int ans=0;
        Arrays.sort(nums);
        while(j<nums.length)
        {
            total+=nums[j];
            while(nums[j]*(j-i+1)>total+k){
                total-=nums[i];
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }

        return ans;
    }
}