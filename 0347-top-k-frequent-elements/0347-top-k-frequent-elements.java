class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        ArrayList<Integer>[] frequencyBuckets = new ArrayList[nums.length + 1];
for (int i = 0; i <= nums.length; i++) {
    frequencyBuckets[i] = new ArrayList<>();
}
HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();

        for(int i : nums){
            count.put(i,count.getOrDefault(i,0) + 1);
        }
for (Map.Entry<Integer, Integer> n : count.entrySet()) {
    int frequency = n.getValue();
    int num = n.getKey();
    frequencyBuckets[frequency].add(num);
}

ArrayList<Integer> arr = new ArrayList<>();
for (int i = nums.length; i >= 0 && arr.size() < k; i--) {
    if (!frequencyBuckets[i].isEmpty()) {
        arr.addAll(frequencyBuckets[i]);
    }
}

int[] ans = new int[k];
for (int i = 0; i < k; i++) {
    ans[i] = arr.get(i);
}

return ans;

    }
}