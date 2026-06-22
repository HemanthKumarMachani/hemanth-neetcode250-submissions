class Solution {
    public int evalRPN(String[] tokens) {
        // input validation
        if (tokens == null || tokens.length == 0)
            return 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (isOp(token)) {
                // here I want to perform result += token stack.pop()
                int b = stack.pop();
                int a = stack.pop();
                stack.push(calculate(a, b, token));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    public boolean isOp(String s) {
        return ((s.equals("+")) || (s.equals("-")) || (s.equals("*")) || (s.equals("/")));
    }
    public int calculate(int a, int b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a* b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Unknown Operand: " + op);
        };
    }
}
