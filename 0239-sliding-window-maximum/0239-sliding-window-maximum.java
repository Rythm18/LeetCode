class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        int j=0,i=0;
        while(j<nums.length)
        {
            while(!deque.isEmpty() && deque.peekLast()<nums[j]){
                deque.pollLast();
            }
            deque.offerLast(nums[j]);

            if(j-i+1==k)
            {
                list.add(deque.peekFirst());
                if(deque.peekFirst()==nums[i])
                    deque.pollFirst();
                i++;
            }
            j++;
        }
        
        int[] arr = list.stream().mapToInt(l -> l).toArray();

        return arr;
    }
}