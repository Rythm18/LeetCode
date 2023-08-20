class Solution {
    public int minimumSum(int n, int k) {
        Set<Integer> st = new HashSet<>();
    int ans = 0;
    for (int i = 1; st.size() < n; ++i) {
        if (!st.contains(k - i)) {
            st.add(i);
            ans += i;
        }
    }
    return ans;
    }
}