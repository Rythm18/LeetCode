class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> coveredPoints = new HashSet<>();
        for (List<Integer> car : nums) {
      
            for (int i = car.get(0); i <= car.get(1); i++) {
                coveredPoints.add(i);
            }
        }

    return coveredPoints.size();
    }
}