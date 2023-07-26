class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int[] fake = new int[arr.length+1];
        ArrayList al = new ArrayList();
        for(int i=0;i<arr.length;i++)
        {
            fake[arr[i]]++;
        }
        for(int j=1;j<fake.length;j++)
        {
            if(fake[j]==0)
            {
                al.add(j);
            }
        }
        return al;
    }
    
    
}