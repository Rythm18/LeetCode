class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1,k=1;
        while(i<=j)
        {
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                boolean c=isPalindrome(s,i,j-1);
                boolean d=isPalindrome(s,i+1,j);
                if(c || d){
                    return true;
                }else{
                    return false;
                }
            }
        }
    
        return true;
    }
    public boolean isPalindrome(String s,int i,int j) {
    
        while(i<=j)
        {
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        
        return true;
    }
}