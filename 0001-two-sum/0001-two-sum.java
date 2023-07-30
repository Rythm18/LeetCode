class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=i+1;

        while(i<j){
            int sum=nums[i]+nums[j];

            if(sum==target){
                return new int[]{i,j};
            }
            else if(j==nums.length-1){
                i++;
                j=i+1;
            }else{
                j++;
            }
        }

        return new int[]{0,0};
    }
}