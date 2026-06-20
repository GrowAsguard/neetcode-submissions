class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        if (nums.length < 3) return answer;

        Arrays.sort(nums);

        for (int i=0; i<nums.length - 2; i++) {
            if (i>0 && nums[i] == nums[i-1]) continue;
            int front = i+1;
            int back = nums.length - 1;
            while (front < back) {
                int sum = nums[i] + nums[front] + nums[back];
                if (sum < 0) front++;
                else if (sum > 0) back--;
                else {
                    answer.add(Arrays.asList(nums[i],nums[front],nums[back]));
                    while (front < back && nums[front]==nums[front+1]) front++;
                    while (front < back && nums[back]==nums[back-1]) back--;
                    front++;
                    back--;
                }
            }
        }
        return answer;
    }
}
