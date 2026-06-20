class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for (int i : nums) {
            if (mySet.contains(i)) return true;
            else mySet.add(i);
        }
        return false;
    }
}