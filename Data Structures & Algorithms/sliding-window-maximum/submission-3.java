class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];

        int left = 0;
        int right = 0;

        int idx = 0;

        Deque<Integer> dq = new ArrayDeque<>();

        while (right < nums.length) {
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[right]) {
                dq.pollLast();
            }
            dq.offerLast(right);
            
            if (right >= k - 1) {
                result[idx++] = nums[dq.peekFirst()];
                if (dq.peekFirst() == left) {
                    dq.pollFirst();
                }
                left++;
            }
            right++;
        }
        return result;
    }
}
