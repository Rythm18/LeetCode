class Solution {
    public int minSwaps(String s) {
        int opening=0,closing=0,un=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='[') opening++;
            else{
                if(opening>closing){

                
                    closing++;
                }
                else un++;
            }
        }

        return (un+1)/2;
    }
}