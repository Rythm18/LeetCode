class Solution {
    public int totalFruit(int[] nums) {
        int j=0,ans=0;
        int k=2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>k){
                map.put(nums[j],map.get(nums[j])-1);
                if(map.get(nums[j])==0){
                    map.remove(nums[j]);
                }
                    j++;
            }
            ans=Math.max(ans,i-j+1);
        }

        return ans;
    }
}