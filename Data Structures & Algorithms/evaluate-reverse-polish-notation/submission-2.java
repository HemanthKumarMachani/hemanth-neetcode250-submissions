class Solution {
    public int evalRPN(String[] tokens) {
        // input validation
        if (tokens == null || tokens.length == 0)
            return 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (isOp(token)) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(evaluateExpression(num1, num2, token));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    public static int evaluateExpression(int num1, int num2, String op) {
        return switch (op) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1* num2;
            case "/" -> num1 / num2;
            default -> throw new IllegalArgumentException("Invalid operation!" + op);
        };
    }
    public boolean isOp(String s) {
        return (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"));
    }
}
