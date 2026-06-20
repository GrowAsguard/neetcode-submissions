class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> myMap = new HashMap<>();
        if (nums == null || nums.length == 0) return false;
        for (int i : nums) {
            if (myMap.containsKey(i)) return true;
            else myMap.put(i,myMap.getOrDefault(i,0) + 1);
        }
        return false;
    }
}