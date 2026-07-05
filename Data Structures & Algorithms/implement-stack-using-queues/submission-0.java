class MyStack {

    Deque<Integer> q1;
    Deque<Integer> q2;

    public MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        if (q1.isEmpty()) {
            Deque<Integer> temp = q2;
            q1 = q2;
            q2 = temp;
        }
        q1.offerLast(x);
    }
    
    public int pop() {
        if (q1.isEmpty()) {
            Deque<Integer> temp = q2;
            q1 = q2;
            q2 = temp;
        }
        for (int i=0; i<q1.size()-1; i++) {
            q2.offerLast(q1.pollFirst());
        }
        return q1.pollFirst();
    }
    
    public int top() {
        return q1.peekLast();
    }
    
    public boolean empty() {
        return q1.size()==0;
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