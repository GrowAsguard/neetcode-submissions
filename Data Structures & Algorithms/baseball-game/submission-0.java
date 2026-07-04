class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();

        int totalSum = 0;

        for (String s : operations) {
            switch (s) {
                case "+":
                    int b = stack.pop();
                    int a = stack.pop();
                    int sum = a + b;
                    stack.push(a);
                    stack.push(b);
                    stack.push(sum);
                    break;
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(2*stack.peek());
                    break;
                default:
                    stack.push(Integer.parseInt(s));
            }
        }

        for (Integer i : stack) {
            totalSum += i;
        }

        return totalSum;
    }
}