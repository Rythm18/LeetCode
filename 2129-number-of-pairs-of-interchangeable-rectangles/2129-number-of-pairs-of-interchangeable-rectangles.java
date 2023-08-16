class Solution {
    public long interchangeableRectangles(int[][] rec) {
        Map<Double,Long> map = new HashMap<>();
        long count=0;
        for(int i=0;i<rec.length;i++)
        {
            // if(map.containsKey((double)rec[i][0]/rec[i][1]))
            //     count+=map.get((double)rec[i][0]/rec[i][1]);
            map.put((double)rec[i][0]/rec[i][1],map.getOrDefault((double)rec[i][0]/rec[i][1],0L)+1);
        }

        for(long val: map.values()){
            count+=(val*(val-1))/2;
        }
        
        return count;
    }
}