class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> map = new HashMap<>();

        
        for(int i=0;i<wall.size();i++)
        {
            int count=0;
            for(int j=0;j<wall.get(i).size()-1;j++)
            {
                count+=wall.get(i).get(j);
                map.put(count,map.getOrDefault(count,0)+1);
            }
        }
        int max=0;
        for(int ele: map.keySet()) {
            max=Math.max(max,map.get(ele));
        }
        return wall.size()-max;
    }
}