class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for (int i : nums) freq.put(i, freq.getOrDefault(i,0) + 1);

        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        
        for (Map.Entry<Integer,Integer> entry : freq.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();

            if (buckets[frequency] == null) buckets[frequency] = new ArrayList<>();
            buckets[frequency].add(element);
        }

        int[] answer = new int[k];
        int idx = 0;

        for (int frequency = buckets.length - 1; frequency >= 0; frequency--) {
            List<Integer> currentBucket = buckets[frequency];
            if (currentBucket == null) continue;
            for (int num : currentBucket) {
                answer[idx++] = num;
                if (idx == k) return answer;
            }
        }

        return answer;
    }
}
