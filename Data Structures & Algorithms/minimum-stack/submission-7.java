class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
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
        int min = Integer.MAX_VALUE;
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
