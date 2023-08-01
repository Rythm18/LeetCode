class Solution {
    public void sortColors(int[] nums) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
        }
        System.out.print(max);

        int[] arr = new int[max+1];

        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
        }

        int x=0;
        for(int i=0;i<arr.length;i++)
        {
            while(arr[i]!=0){
                nums[x]=i;
                x++;
                arr[i]--;
            }
        }
    }
}