class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;

        while(i!=str1.length())
        {
            if(str1.charAt(i)==str2.charAt(j) || (char)('a'+(str1.charAt(i)-'a'+1)%26)==str2.charAt(j)){
                j++;
            }
            i++;
            if(j==str2.length())
                return true;
        }
        
        return false;
    }
}