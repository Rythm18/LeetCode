class Solution {
    public void setZeroes(int[][] arr) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        Iterator it = row.iterator();
        while(it.hasNext())
        {
            int i=(int)it.next();
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=0;
            }
        }
        Iterator it2 = col.iterator();
        while(it2.hasNext())
        {
            int i=(int)it2.next();
            for(int j=0;j<arr.length;j++)
            {
                arr[j][i]=0;
            }
        }


    }
}