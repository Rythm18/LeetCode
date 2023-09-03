class Solution {
    public boolean checkStrings(String s1, String s2) {
        HashMap<Character, Integer> even = new HashMap<>();
        HashMap<Character, Integer> odd = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                even.put(s1.charAt(i), even.getOrDefault(s1.charAt(i), 0) + 1);
            else
                odd.put(s1.charAt(i), odd.getOrDefault(s1.charAt(i), 0) + 1);
            if (i % 2 == 0)
                even.put(s2.charAt(i), even.getOrDefault(s2.charAt(i), 0) - 1);
            else
                odd.put(s2.charAt(i), odd.getOrDefault(s2.charAt(i), 0) - 1);
        }
        for (Map.Entry<Character, Integer> entry : even.entrySet()) {
            if (entry.getValue() != 0)
                return false;
        }
        for (Map.Entry<Character, Integer> entry : odd.entrySet()) {
            if (entry.getValue() != 0)
                return false;
        }
        return true;   
    }
}