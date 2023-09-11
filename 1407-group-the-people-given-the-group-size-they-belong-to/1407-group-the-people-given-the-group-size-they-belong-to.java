class Solution {
    public List<List<Integer>> groupThePeople(int[] arr) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int j=arr[i];
            map.putIfAbsent(j,new ArrayList<>());
            map.get(j).add(i);
            if(map.get(j).size()==j){
                ans.add(map.get(j));
                map.remove(j);
            }
        }
        return ans;
    }
}