class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String s : tokens) {
            switch(s) {
                case "+": {
                    int a = stack.pop();
                    int b = stack.pop();
                    int sum = a + b;
                    stack.push(sum);
                    break;
                }
                case "-": {
                    int a = stack.pop();
                    int b = stack.pop();
                    int sub = b - a;
                    stack.push(sub);
                    break;
                }
                case "*": {
                    int a = stack.pop();
                    int b = stack.pop();
                    int prod = a * b;
                    stack.push(prod);
                    break;
                }
                case "/": {
                    int a = stack.pop();
                    int b = stack.pop();
                    int div = b/a;
                    stack.push(div);
                    break;
                }
                default:
                    stack.push(Integer.parseInt(s));
            }
        }

        return stack.peek();
    }
}
