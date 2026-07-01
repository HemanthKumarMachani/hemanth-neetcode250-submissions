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
        int minVal = minStack.peek();
        while (!minStack.isEmpty()) {
            int top = minStack.pop();
            minVal = Math.min(top, minVal);
            temp.push(top);
        }
        while (!temp.isEmpty()) {
            minStack.push(temp.pop());
        }
        return minVal;
    }
    // public MinObj{
    //     int minVal;
    //     int val;
    //     public MinObj(int minVal, int val){
    //         this.minVal = minVal;
    //         this.val = val;
    //     }
    // }
}
