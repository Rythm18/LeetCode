class Solution {
    public int maxSum(int[] nums) {
        int max=-1;
        int maxDigit=0;
        for(int i=0;i<nums.length-1;i++)
        {
            maxDigit=Digits(nums[i]);
            int maxT=0;
            for(int j=i+1;j<nums.length;j++)
            {
                maxT=Digits(nums[j]);
                if(maxDigit==maxT){
                    max=Math.max(max,nums[i]+nums[j]);
                }
            }
        }
        return max;
    }
    public int Digits(int n)
{
        int largest = 0;

        while(n != 0)
        {
            int r = n % 10;
            largest = Math.max(r, largest);
            n = n / 10;
        }
       return largest;
}
}