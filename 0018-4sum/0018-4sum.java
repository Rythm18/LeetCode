class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        int first;
        for(int j=0; j<nums.length-3; j++){
            int left;
            int right;
            for(int i=j+1; i<nums.length-2 ; i++){
                left = i+1;
                right = nums.length-1;
                while(left<right){
                    
                    long sum = nums[j];
                    sum += nums[i];
                    sum += nums[left];
                    sum += nums[right];
                    if(sum==target){
                        set.add(Arrays.asList(nums[j],nums[i],nums[left],nums[right]));
                        left++;
                    }
                    else if(sum<target) left++;
                    else right--;
                }

            }          
        }


        return new ArrayList<>(set);
    }
}