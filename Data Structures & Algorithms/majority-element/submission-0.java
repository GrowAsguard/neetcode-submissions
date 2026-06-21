class Solution {
    public int majorityElement(int[] nums) {
        int required = nums.length / 2;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i,0) + 1);
            if (freq.get(i) > required) return i;
        }
        for (int i : freq.keySet()) {
            if (freq.get(i) > required) return i;
        }
        return -1;
    }
}