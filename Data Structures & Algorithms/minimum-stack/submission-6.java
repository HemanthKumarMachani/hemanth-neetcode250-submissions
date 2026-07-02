class MinStack {
    Stack<MinObj> minStack;
    public MinStack() {
        minStack = new Stack<>();
    }

    public void push(int val) {
        if (minStack.isEmpty()) {
            minStack.push(new MinObj(val, val));
        } else {
            minStack.push(new MinObj(val, Math.min(val, minStack.peek().minVal)));
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
    class MinObj {
        int val;
        int minVal;
        public MinObj(int val, int minVal) {
            this.val = val;
            this.minVal = minVal;
        }
    }
}
