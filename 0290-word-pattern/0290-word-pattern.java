class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character,String> map1=new HashMap<>();
        String[] str = s.split(" ");
        if(pattern.length()!=str.length) return false;
        int flag=0;
        for(int i=0;i<pattern.length();i++)
        {
            if(!map1.containsKey(pattern.charAt(i)) && !map1.containsValue(str[i])){
                map1.put(pattern.charAt(i),str[i]);
            }
            else if(map1.containsKey(pattern.charAt(i)) ){
                String s1 = map1.get(pattern.charAt(i));
                if(s1.equals(str[i]))
                    continue;
                else
                    flag=1;
            }
            else{
                flag=1;
            }
        }

        if(flag==1) return false;
        return true;

    }
}