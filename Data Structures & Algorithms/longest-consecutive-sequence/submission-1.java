class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for (int x : nums) mySet.add(x);

        int maxCount = 0;
        for (int num : nums) {
            int count = 1;
            while (mySet.contains(++num)) count++;
            maxCount = Math.max(maxCount,count);
        }

        return maxCount;
    }
}
