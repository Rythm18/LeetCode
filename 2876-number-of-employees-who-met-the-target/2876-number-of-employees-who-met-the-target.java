class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int var:hours){
            if(var>=target)
                count++;
        }
        return count;
    }
}