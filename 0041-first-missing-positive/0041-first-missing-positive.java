class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0 && nums[i]<=nums.length){
                set.add(nums[i]);
            }
        } 

        for(int i=0;i<nums.length+1;i++)
        {
            if(!set.contains(i+1)){
                return i+1;
            }
        }  
        return 0;
    }
}