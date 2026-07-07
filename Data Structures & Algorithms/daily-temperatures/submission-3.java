class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];

        for (int i=0; i<temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int popped = stack.pop();
                int distance = i - popped;
                result[popped] = distance;
            }
            stack.push(i);
        }
        return result;
    }
}
