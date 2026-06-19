class MinStack {
    private Stack<MinObj> stack;
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new MinObj(val, val));
        } else {
            stack.push(new MinObj(val, Math.min(val, stack.peek().minValue)));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().top;
    }

    public int getMin() {
        return stack.peek().minValue;
    }
}
class MinObj {
    int top, minValue;
    MinObj(int top, int minValue) {
        this.top = top;
        this.minValue = minValue;
    }
}
