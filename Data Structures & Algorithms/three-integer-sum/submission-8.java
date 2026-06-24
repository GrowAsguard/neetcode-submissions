class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) return result;

        Arrays.sort(nums);
        
        if (nums[0] > 0 || nums[nums.length-1] < 0) return result;

        for (int i=0; i<nums.length-2; i++) {
            if (i>0 && nums[i] == nums[i-1]) continue;

            int required = -nums[i];

            int left = i+1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum < required) 
                    left++;
                else if (sum > required)
                    right--;
                else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++; right--;

                    while (left < right && nums[left] == nums[left-1]) left++;
                    while (left < right && nums[right] == nums[right+1]) right--;
                }
            }
        }
        return result;
    }
}
