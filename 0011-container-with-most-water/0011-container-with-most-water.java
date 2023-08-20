class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=0;
        while(i<j){
            int min=Math.min(height[i],height[j]);
            int len=j-i+1-1;
            ans=Math.max(ans,min*len);
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}