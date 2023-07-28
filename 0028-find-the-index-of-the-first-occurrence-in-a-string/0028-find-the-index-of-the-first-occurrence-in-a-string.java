class Solution {
    public int strStr(String hay, String needle) {
        int i=0;
        int j=0;
        int ans=0;
        while(i<hay.length() && j<needle.length()){
            if(hay.charAt(i)==needle.charAt(j)){
                i++;
                j++;
                
            
            }else{
                i=ans+1;
                j=0;  
                ans=i;              
            }
            
            
        }
        if(j==needle.length()) return ans;
        return -1;
    }
}