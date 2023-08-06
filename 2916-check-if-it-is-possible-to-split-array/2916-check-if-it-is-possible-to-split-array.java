class Solution {
    public boolean canSplitArray(List<Integer> nums, int m) {
        boolean ans=false;
        if((nums.size()==1 && m>=1) || nums.size()==2) return true;
        
        for(int i=0;i<nums.size()-1;i++)
        {
            if(nums.get(i)+nums.get(i+1)>=m){
                ans=true;
            }
        }
        
        return ans;
    }
}