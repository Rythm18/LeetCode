class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int n=p.length();
        Map<Character,Integer> map = new HashMap<>();
        for(char c: p.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int i=0,j=0;
        Map<Character,Integer> map1 = new HashMap<>();
        while(j<s.length())
        {
            map1.put(s.charAt(j),map1.getOrDefault(s.charAt(j),0)+1);
            j++;
            if(map1.equals(map)){
                ans.add(i);
            }
            if(j-i==p.length()){
                char l = s.charAt(i);
                if(map1.containsKey(l)){
                    map1.put(l,map1.get(l)-1);
                    if(map1.get(l)==0){
                        map1.remove(l);
                    }
                }
                i++;
            }
            
        }
        return ans;
    }
}