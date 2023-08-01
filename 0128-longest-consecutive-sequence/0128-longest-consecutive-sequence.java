class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;

        Set<Integer> list = new HashSet<Integer>();

        for(int i=0;i<nums.length;i++)
        {
           list.add(nums[i]);
        }

        int[] arr = new int[list.size()];

        Iterator<Integer> it = list.iterator();

        int k=0;

        while(it.hasNext()){
            arr[k]=it.next().intValue();
            k++;
        }
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int j=0,i=1;
        int cnt=1;
        int ans=Integer.MIN_VALUE;
        while(i<arr.length)
        {
            //int ans=;
            if(Math.abs(arr[i]-arr[j])==1) {
                cnt++;
                ans=Math.max(ans,cnt);
            }else{
                cnt=1;
            }
            i++;
            j++;
        }
        ans=Math.max(ans,cnt);
        if(ans==Integer.MIN_VALUE) return 0;
        return ans;
    }
}