class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] answer = new int[n-k+1];

        Deque<Integer> myDq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            //removing out of bound elements
            while (!myDq.isEmpty() && myDq.peekFirst() <= i-k) {
                myDq.pollFirst();
            }

            //removing smaller elements from the back that are smaller than current
            while (!myDq.isEmpty() && nums[myDq.peekLast()] <= nums[i]) {
                myDq.pollLast();
            } 

            myDq.addLast(i);

            if (i >= k-1) {
                answer[i - k + 1] = nums[myDq.peekFirst()];
            }
        }

        return answer;
    }
}
