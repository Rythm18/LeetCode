class Solution {
    public int maxVowels(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('e',1);
        map.put('i',1);
        map.put('o',1);
        map.put('u',1);
        int j=0,ans=0,sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=map.getOrDefault(s.charAt(i),0);
        }
        ans=Math.max(ans,sum);
        for(int i=1;i<s.length()-k+1;i++)
        {
            sum-=map.getOrDefault(s.charAt(i-1),0);
            sum+=map.getOrDefault(s.charAt(i+k-1),0);
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}