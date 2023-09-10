class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        
        int x =Math.max(Math.abs(fx - sx), Math.abs(fy - sy));
        if(sx==fx && sy==fy && t==1)
            return false;
        if(t>=x)
            return true;
        else
            return false;
    }
}