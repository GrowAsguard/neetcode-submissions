class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            try {
                stack.push(Integer.parseInt(token));
            }
            catch (NumberFormatException e) {
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                }
            }
        }

        return stack.pop();
    }
}
