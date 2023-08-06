class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums)
        {
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        
        n=n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }
        return 0;
    }
}