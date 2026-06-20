class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> myMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int difference = target - nums[i];
            if (!myMap.containsKey(difference)) myMap.put(nums[i],i);
            else return new int[]{myMap.get(difference),i};
        }
        return new int[]{};
    }
}
