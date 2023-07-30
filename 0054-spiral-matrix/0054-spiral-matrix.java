class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<Integer>();
        int sr=0,ec=matrix[0].length-1,er=matrix.length-1,sc=0;

        while(sr<=er && ec>=sc)
        {

        
        for(int i=sc; i<=ec; i++)
        {
            arr.add(matrix[sr][i]);
        }
        sr++;

        for(int i=sr; i<=er; i++)
        {
            arr.add(matrix[i][ec]);
        }
        ec--;

        if(sr<=er)
        {
            for(int i=ec; i>=sc; i--)
        {
            arr.add(matrix[er][i]);
        }
        er--;
        }

        if(sc<=ec)
        {
            for(int i=er; i>=sr; i--)
        {
            arr.add(matrix[i][sc]);
        }
        sc++;
        }
        
        }
        return arr;
    }
}