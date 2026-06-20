class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] answer = new int[2*n];

        // System.arraycopy(nums, 0, answer, 0, n);
        // System.arraycopy(nums, 0, answer, n, n);

        for (int i=0; i<n; i++) {
            answer[i] = nums[i];
            answer[i+n] = nums[i];
        }

        return answer;
    }
}