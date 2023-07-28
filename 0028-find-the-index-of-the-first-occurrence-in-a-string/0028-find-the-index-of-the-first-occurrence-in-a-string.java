class Solution {
    public int strStr(String hay, String needle) {
        int i=0;
        int j=0;
        int ans=-1;
        while(i<hay.length() && j<needle.length()){
            if(hay.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }else{
                i++;
                i = i - j;
                j=0;                
            }
            if(j==needle.length()){
                ans=i-j;
            }
            
        }
        if(ans>=0) return ans;
        return -1;
    }
}