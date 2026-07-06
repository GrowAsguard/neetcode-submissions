class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int ass : asteroids) {
            boolean alive = true;

            while (alive && ass < 0 && !stack.isEmpty() && stack.peek() > 0) {
                if (Math.abs(ass) > stack.peek()) {
                    stack.pop();
                }
                else if (Math.abs(ass) == Math.abs(stack.peek())) {
                    stack.pop();
                    alive = false;
                }
                else {
                    alive = false;
                }
            }
            if (alive) stack.push(ass);
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}