class Solution {
    public int leastBricks(List<List<Integer>> wall) {
         Map<Integer,Integer> hmap = new HashMap<>();

        int maxFreq = 0;
        for(int i = 0; i < wall.size(); i++){
            int count = 0;
            for(int j = 0; j < wall.get(i).size()-1; j++){
                count += wall.get(i).get(j);
                hmap.put(count, hmap.getOrDefault(count, 0)+1) ;
            }
        }

        for(int ele: hmap.keySet()){
            maxFreq = Math.max(maxFreq, hmap.get(ele));
        }

        int result = wall.size() - maxFreq;
        return result;
    }
}