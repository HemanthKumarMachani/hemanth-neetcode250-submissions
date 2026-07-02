class MinStack {
    Stack<Integer> minStack;
    public MinStack() {
        minStack = new Stack<>();
    }

    public void push(int val) {
        minStack.push(val);
    }

    public void pop() {
        minStack.pop();
    }

    public int top() {
        return minStack.peek();
    }

    public int getMin() {
        Stack<Integer> temp = new Stack<>();
        int min = minStack.peek();
        while (!minStack.isEmpty()) {
            temp.push(minStack.peek());
            min = Math.min(min, minStack.pop());
        }
        while (!temp.isEmpty()) {
            minStack.push(temp.pop());
        }
        return min;
    }
}
