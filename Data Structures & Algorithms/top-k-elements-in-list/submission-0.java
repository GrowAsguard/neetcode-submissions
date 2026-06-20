class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> myMap = new HashMap<>();
        for (int num : nums) {
            myMap.put(num, myMap.getOrDefault(num,0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1];
        for (int i=0; i<freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer,Integer> entry : myMap.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;

        for (int i = freq.length - 1; i>0; i--) {
            List<Integer> bucket = freq[i];
            if (bucket == null) continue;
            for (int num : bucket) {
                if (index < k) result[index++]=num;
                else return result;
            }
        }
        return result;
    }
}
