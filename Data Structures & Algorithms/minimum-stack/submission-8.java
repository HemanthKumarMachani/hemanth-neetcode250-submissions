class MinStack {
    Stack<Integer> stack1;

    public MinStack() {
        stack1 = new Stack<>();
    }

    public void push(int val) {
        stack1.push(val);
    }

    public void pop() {
        stack1.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        Stack<Integer> stack2 = new Stack<>();
        int min = stack1.peek();
        while (!stack1.isEmpty()) {
            min = Math.min(min, stack1.peek());
            stack2.push(stack1.pop());
        }
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return min;
    }
}
