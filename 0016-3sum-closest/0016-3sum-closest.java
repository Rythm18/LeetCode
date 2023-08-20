class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
         int n=nums.length;
          int cSum = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length-2;i++)
        {
            int k=i+1;
            int j=n-1;
            while(k<j){
                int sum=nums[j]+nums[k]+nums[i];
                if((Math.abs(target - sum) < Math.abs(target - cSum))){
                    cSum=sum;
                }
                if(sum<target){
                    k++;
                }else{
                    j--;
                }
            }

        }
        
        return cSum ;
        
    }
}