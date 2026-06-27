class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // if (nums == null || nums.length == 0) return new int[];

        Map<Integer,Integer> freq = new HashMap<>();
        for (int num : nums) 
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        
        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer,Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int value = entry.getValue();
            if (value > nums.length/3) result.add(num);
        }
        return result;
    }
}