class Solution {
    public String frequencySort(String s) {
        String str="";
        HashMap<Character, Integer> count = new HashMap<>();
        for (char num : s.toCharArray()) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for(int i=0;i<count.size();i++)
        {

            Map.Entry<Character, Integer> maxEntry = null;
            for(Map.Entry<Character, Integer> ent : count.entrySet()){
                if (maxEntry == null || ent.getValue().compareTo(maxEntry.getValue()) > 0) {
                    maxEntry = ent;
                }
            }

            for(int j=0;j<maxEntry.getValue();j++)
            {
                char ch=maxEntry.getKey();
                str+=ch;
            }
            count.put(maxEntry.getKey(),0);
        }

        return str;

    }
}