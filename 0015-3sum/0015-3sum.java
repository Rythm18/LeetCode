class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> main = new HashSet<List<Integer>>();
        List<List<Integer>> main1 = new ArrayList<List<Integer>>();


        Arrays.sort(nums);

        int n=nums.length;


        for(int i=0;i<nums.length-2;i++)
        {
            int k=i+1;
            int j=n-1;
            
            int[] base = new int[2];
            while(k<j)
            {
                if(nums[j]+nums[k]+nums[i]==0){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[k]);
                    list.add(nums[j]);
                    main.add(list);
                    k++;
                    j--;
                }
                else if(nums[j]+nums[k]+nums[i]>0){
                    j--;
                }else{
                    k++;
                }
            }
        }

        main1.addAll(main);
        
        return main1;
    }
}