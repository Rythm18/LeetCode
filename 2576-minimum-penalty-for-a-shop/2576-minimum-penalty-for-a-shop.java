class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int ans=-1;
        int max=0,maxS=0;

        for(int i=0;i<n;i++)
        {
            max+=(customers.charAt(i)=='Y')? 1 :-1;
            if(max>maxS){
                ans=i;
                maxS=max;
            }
        }
        return ans+1;
    }
}