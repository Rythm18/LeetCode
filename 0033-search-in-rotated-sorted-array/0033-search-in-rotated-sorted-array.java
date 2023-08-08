class Solution {
    public int search(int[] nums, int target) {
        int pivot = pivot(nums);
        System.out.println(pivot);
        if(pivot==-1){
            return bSearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return bSearch(nums,target,0,pivot-1);
        }
        return bSearch(nums,target,pivot+1,nums.length-1);


    }

    int bSearch(int[] nums, int t, int s,int e)
    {
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==t){
                return mid;
            }
            else if(nums[mid]>t){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }

    int pivot(int[] nums)
    {
        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            int mid= i+(j-i)/2;
            if(mid>i && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(mid<j && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]<=nums[i]){
                j=mid-1;
            }else{
                i=mid+1;
            }

            
        }
        return -1;
    }
}