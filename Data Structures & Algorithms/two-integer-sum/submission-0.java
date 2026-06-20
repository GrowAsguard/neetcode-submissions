class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> myMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int difference = target - nums[i];
            if (myMap.containsKey(difference)){
                return new int[]{myMap.get(difference),i};
            }
            else {
                myMap.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
