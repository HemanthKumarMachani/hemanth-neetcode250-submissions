class Solution {
    public int calPoints(String[] operations) {
        // input validation
        if (operations == null || operations.length == 0)
            return 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;
        for (String op : operations) {
            if ("+".equals(op)) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
                sum += newTop;
            } else if ("D".equals(op)) {
                stack.push(2 * stack.peek());
                sum += stack.peek();
            } else if ("C".equals(op)) {
                sum -= stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
                sum += stack.peek();
            }
        }
        return sum;
    }
}