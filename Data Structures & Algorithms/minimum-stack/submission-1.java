class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.addLast(val);
        if (minStack.isEmpty() || val <= minStack.peekLast()) {
            minStack.addLast(val);
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) return;
        int top = stack.pollLast();
        if (top == minStack.peekLast()) {
            minStack.pollLast();
        }
    }
    
    public int top() {
        return stack.peekLast();
    }
    
    public int getMin() {
        return minStack.peekLast();
    }
}
