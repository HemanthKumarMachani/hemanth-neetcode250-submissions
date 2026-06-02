public class Solution {
    public int calPoints(String[] ops) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
                result += newTop;
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
                result += stack.peek();
            } else if (op.equals("C")) {
                result -= stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
                result += stack.peek();
            }
        }
        return result;
    }
}