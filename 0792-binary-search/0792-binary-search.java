class Solution {
    public int search(int[] nums, int target) {
        int ans = binary(nums,target,0,nums.length-1);
        return ans;
    }

    public int binary(int[] arr, int target, int s,int e)
    {
        while(s<=e)
        {
            int mid = s + (e - s)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
              return binary(arr,target, mid + 1, e);
            }
            return binary(arr,target,s,mid-1);
        }
        return -1;

    }

}
