class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt=0;
        int n=low;
        while(n<=high)
        {
            if(isSymetric(n))
                cnt++;
            n++;
        }
        return cnt;
    }
    public boolean isSymetric (int number) {

        int fSum = 0,eSum=0;
        String val = String.valueOf(number); 
        if(val.length()%2!=0) return false;
        for(int i=0;i<val.length()/2;i++)
        {
            char c = val.charAt(i);
            int num = Character.getNumericValue(c);
            fSum += num;
        }
        for(int i=val.length()/2;i<val.length();i++)
        {
            char c = val.charAt(i);
            int num = Character.getNumericValue(c);
            eSum += num;
        }
    

    return fSum==eSum;
}
}