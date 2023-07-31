class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        
        reverse(s,i,j);
    }
    public char[] reverse(char[] ch, int i, int j)
    {
        while(i<j)
        {
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return ch;
    }
}