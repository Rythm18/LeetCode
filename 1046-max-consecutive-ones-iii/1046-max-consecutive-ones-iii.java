class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0;
        int total=0,max=0;

        while(j<nums.length)
        {
            total+=nums[j];

            while(j-i+1>total+k){
                total-=nums[i];
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }

        return max;
    }
}