class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            if (!mySet.contains(nums[i])) {
                mySet.add(nums[i]);
            }
            else {
                return true;
            }
        }
        return false;
    }
}