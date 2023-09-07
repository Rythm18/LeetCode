class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length];

        for (int i = 0; i < nums3.length ; i++)
        {
            nums3[i] =  findNextMaxNum(nums2 , nums1[i]);
        }
        return nums3;
    }

    public static int findNextMaxNum(int[] arr , int n )
    {
         int temp = -1 ;
        for (int i = 0 ; i < arr.length ; i++)
        {
            if (arr[i] == n) {
                while ((i + 1) < arr.length && temp <= n) {
                    i++;
                    temp = Math.max(n, arr[i]);
                }
                break;
            }
        }
        return (temp == n) ? -1 : temp ;
    }
}