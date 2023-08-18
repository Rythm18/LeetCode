class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        List<Integer> ans = new ArrayList<>();
        
        if(m > n) return ans;

        int smap[] = new int[26];
        int pmap[] = new int[26];
        for(int i = 0; i < m; i++){
            smap[s.charAt(i) - 'a']++;
            pmap[p.charAt(i) - 'a']++;
        }
        if(Arrays.equals(smap,pmap)){
            ans.add(0);
        }
        for(int i = m; i < n; i++){
            smap[s.charAt(i) - 'a']++;
            smap[s.charAt(i-m) - 'a']--;
            if(Arrays.equals(smap,pmap)){
                ans.add(i-m+1);
            }
        }
        return ans;
    }
}