class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0;
        
        for(i=0;i<nums.length;i++)
        {
          int j=i+1;
          while(j<nums.length&&Math.abs(i-j)<=k){
            if(nums[i]==nums[j]){
              return true;
            }
            j++;
          }
        }
        return false;
    }
}