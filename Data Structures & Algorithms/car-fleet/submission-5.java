class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pairs = new int[position.length][2];
        for (int i=0; i<position.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }

        Arrays.sort(pairs, (a,b) -> Integer.compare(b[0], a[0]));

        // Deque<Double> stack = new ArrayDeque<>();

        // for (int[] p : pairs) {
        //     double time = (double) (target - p[0]) / p[1];

        //     if (!stack.isEmpty() && time <= stack.peek()) continue;
        //     stack.push(time);
        // }

        // return stack.size();

        int fleets = 0;
        double slowest_time = 0;

        for (int i=0; i<position.length; i++) {
            double time = (double)(target - pairs[i][0]) / pairs[i][1];
            if (time > slowest_time) {
                fleets++;
                slowest_time = time;
            }
        }

        return fleets;
    }
}
