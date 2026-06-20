class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i : nums) {
            frequency.put(i, frequency.getOrDefault(i,0)+1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (Map.Entry<Integer,Integer> e : frequency.entrySet()) {
            
            int number = e.getKey();
            int count = e.getValue();

            if (buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }

            buckets[count].add(number);
        }

        int[] answer = new int[k];
        int idx=0;
        for (int i = buckets.length - 1; i>=0 && idx < k; i--) {
            if (buckets[i] != null) {
                for (int bucket_value : buckets[i]) {
                    answer[idx] = bucket_value;
                    idx++;
                    if (idx==k) break;
                }
            }
        }

        return answer;
    }
}
