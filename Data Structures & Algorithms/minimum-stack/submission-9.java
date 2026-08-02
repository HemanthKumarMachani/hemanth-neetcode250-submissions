class MinStack {
    Stack<MinObj> minStack;

    public MinStack() {
        minStack = new Stack<>();
    }

    public void push(int value) {
        if (minStack.isEmpty()) {
            minStack.push(new MinObj(value, value));
        } else {
            minStack.push(new MinObj(value, Math.min(value, minStack.peek().minVal)));
        }
    }

    public void pop() {
        minStack.pop();
    }

    public int top() {
        return minStack.peek().val;
    }

    public int getMin() {
        return minStack.peek().minVal;
    }
}

class MinObj {
    int val;
    int minVal;

    public MinObj(int val, int minVal) {
        this.val = val;
        this.minVal = minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */