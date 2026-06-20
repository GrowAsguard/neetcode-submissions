class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for (int x : nums) mySet.add(x);

        int maxCount = 0;

        for (int num : nums) {
            if (mySet.contains(num-1)) continue;

            int count = 1;
            int current = num;
            while (mySet.contains(current + 1)) {
                current++;
                count++;
            }
            maxCount = Math.max(maxCount,count);
        }

        return maxCount;
    }
}
