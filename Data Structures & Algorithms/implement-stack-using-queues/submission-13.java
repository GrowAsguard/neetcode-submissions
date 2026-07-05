class MyStack {

    Deque<Integer> q1;
    Deque<Integer> q2;

    public MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        if (q1.isEmpty()) swapQueues();

        q1.offerLast(x);
    }
    
    public int pop() {
        int n = q1.size();

        for (int i=0; i< n-1; i++) {
            q2.offerLast(q1.pollFirst());
        }

        int ans = q1.pollFirst();
        swapQueues();
        return ans;
    }
    
    public int top() {
        return q1.peekLast();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }

    private void swapQueues() {
        Deque<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */