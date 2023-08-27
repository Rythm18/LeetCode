class Solution {
    public long minimumPossibleSum(int n, int target) {
        Set<Integer> st = new HashSet<>();
        long ans = 0;
        for (int i = 1; st.size() < n; i++) {
            if (!st.contains(target - i)) {
                st.add(i);
                ans += i;
            }
        }
        return ans;
    }
}