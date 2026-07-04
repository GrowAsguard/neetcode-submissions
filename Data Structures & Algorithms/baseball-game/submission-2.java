class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();

        int totalScore = 0;

        for (String s : operations) {
            switch (s) {
                case "+":
                    int b = stack.pop();
                    int a = stack.peek();
                    int sum = a + b;
                    stack.push(b);
                    stack.push(sum);
                    totalScore += sum;
                    break;
                case "C":
                    totalScore -= stack.pop();
                    break;
                case "D":
                    int doubled = 2*stack.peek();
                    stack.push(doubled);
                    totalScore += doubled;
                    break;
                default:
                    int num = Integer.parseInt(s);
                    stack.push(num);
                    totalScore += num;
            }
        }
        return totalScore;
    }
}