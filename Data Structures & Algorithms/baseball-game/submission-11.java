class Solution {
    public int calPoints(String[] operations) {
        // input validation
        if (operations == null || operations.length == 0)
            return 0;
        int sum = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (String op : operations) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
                sum += newTop;
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
                sum += stack.peek();
            } else if (op.equals("C")) {
                sum -= stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
                sum += stack.peek();
            }
        }
        return sum;
    }
}