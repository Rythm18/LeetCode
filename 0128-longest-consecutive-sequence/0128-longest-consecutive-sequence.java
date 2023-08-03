class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;

        Set<Integer> list = new HashSet<Integer>();

        for(int i=0;i<nums.length;i++)
        {
           list.add(nums[i]);
        }
        int ans=1;
        for(int num:nums){
            if(!list.contains(num-1)){
                int cnt=1;
                while(list.contains(num+1)){
                    num++;
                    cnt++;
                }
                ans=Math.max(ans,cnt);
            }
        }
        return ans;
    }
}