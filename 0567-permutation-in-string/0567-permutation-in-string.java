class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){
            return false;
        }
        int[] count = new int[26];
        int i=s1.length()-1;

        for(int k=0;k<s1.length();k++)
        {
            count[s1.charAt(k)-'a']++;
        }
        int[] counts2= new int[26];
        int k=0,j=0;
        while(j<s2.length())
        {
            counts2[s2.charAt(j)-'a']++;
            if(j-k+1==s1.length()){
                if(areEqual(count,counts2)) return true;
            }

            if(j-k+1<s1.length()) j++;
            else{
                counts2[s2.charAt(k)-'a']--;
                k++;
                j++;
            }
        }
        return false;

    }

    public boolean areEqual(int[] a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}