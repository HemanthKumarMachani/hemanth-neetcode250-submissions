class Solution {
    public int evalRPN(String[] tokens) {
        // input validation
        if (tokens == null || tokens.length == 0)
            return 0;
        // Stack to store elements and evaluate when we encounter arithermetic operator
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (isOperator(token) && !stack.isEmpty()) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(evaluate(first, second, token));
            } else
                stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }

    private boolean isOperator(String op) {
        return ("+".equals(op) || "-".equals(op) || "*".equals(op) || "/".equals(op));
    }

    private int evaluate(int num1, int num2, String operator) {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new IllegalArgumentException("Invalid Opeator: " + operator);
        };
    }
}