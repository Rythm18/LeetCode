class Solution {
    public void moveZeroes(int[] nums) {
        int j=0, i=0;
        while(i<nums.length)
        {
            if(( nums[i]!=0))
            {
                swap(nums,i,j);
                j++;
            }
            i++;
            
        }
        
    }
    public void swap(int[] arr, int x,int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}