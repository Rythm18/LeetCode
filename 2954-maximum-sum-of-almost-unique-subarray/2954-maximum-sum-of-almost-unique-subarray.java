class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        long maxsum=0;
        long sum=0;
        int n =nums.size();
        
         HashMap<Integer,Integer> hm = new HashMap<>();
        
        
        for(int i =0;i<k;i++)
        {
            hm.put(nums.get(i),hm.getOrDefault(nums.get(i),0)+1);
            sum+=nums.get(i); 
        }
        
        if(hm.size()>=m) maxsum=Math.max(sum,maxsum);
        
        
        for(int i =k;i<n;i++)
        {
            sum-=nums.get(i-k);
            hm.put(nums.get(i-k),hm.get(nums.get(i-k))-1);
            
            if(hm.get(nums.get(i-k))==0) hm.remove(nums.get(i-k));
            
            sum+=nums.get(i);
            hm.put(nums.get(i),hm.getOrDefault(nums.get(i),0)+1);
         
            if(hm.size()>=m) maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
}