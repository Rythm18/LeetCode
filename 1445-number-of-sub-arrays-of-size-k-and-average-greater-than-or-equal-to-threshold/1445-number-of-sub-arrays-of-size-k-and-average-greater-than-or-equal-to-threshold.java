class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt=0;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        if(sum/k>=threshold){
            cnt++;
        }

        for(int i=1;i<arr.length-k+1;i++)
        {
            sum=sum-arr[i-1];
            sum=sum+arr[i+k-1];
            if(sum/k>=threshold){
                cnt++;
            }
        }

        return cnt;
    }
}