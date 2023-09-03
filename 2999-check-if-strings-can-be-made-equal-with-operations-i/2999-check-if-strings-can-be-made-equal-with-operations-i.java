class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        char[] c = s1.toCharArray();
        char[] ch = s2.toCharArray();
        for(int i=0;i<2;i++)
        {
            if(ch[i]!=c[i])
            {   
                char temp = c[i];
                c[i] = c[i+2];
                c[i+2] = temp;
                if(Arrays.equals(c,ch))
                    return true;
            }
            
            
        }
        
        return false;  
        
    }
    
}